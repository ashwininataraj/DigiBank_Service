package com.digibank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digibank.entity.Banker;
import com.digibank.service.BankerService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/banker")
public class BankerController {
	@Autowired
	BankerService bankerService;
	@PostMapping("/")
	public Banker saveBanker(@RequestBody Banker banker) {
	log.info("Save Banker data");
	return	bankerService.saveBanker(banker);
	}
	@GetMapping("/{id}")
	public Banker findBankerbyId(@PathVariable("id") Long bankerId) {
		log.info("get the banker");
		return bankerService.findbyBankerId(bankerId);
	}
//	@GetMapping("/email")
//	public Banker findBankerbyEmail(@RequestBody String email) {
//		log.info("get the banker");
//		return bankerService.findBankerbyEmail(email);
//	}
	@GetMapping("/details")
	public ResponseEntity<Banker> findBankerbyEmail(@RequestParam("email") String email) {
		Banker banker = bankerService.findBankerbyEmail(email);
        if (banker != null) {
            return new ResponseEntity<>(banker, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
	public List<Banker> findAll() {
		return bankerService.findAllBankers();
		
	}
}
