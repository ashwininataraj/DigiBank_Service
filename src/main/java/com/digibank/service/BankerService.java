package com.digibank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digibank.entity.Banker;
import com.digibank.repository.BankerRepository;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class BankerService {
	@Autowired
	BankerRepository bankerRepository;
	
	public Banker saveBanker(Banker banker) {
		log.info("save banker");
		return bankerRepository.save(banker);
	}
	public Banker findbyBankerId(Long bankerId) {
		log.info("get the banker");
		return bankerRepository.findBankerByBankerId(bankerId);
	}
	public Banker findBankerbyEmail(String email) {
		System.out.println(email+"sddddddddd");
		 Banker banker =bankerRepository.findBankerByEmail(email);
		 System.out.println(banker+"email");
		// System.out.println(banker.getEmail()+"email");
		 return bankerRepository.findBankerByEmail(email);
	}
	public List<Banker> findAllBankers() {
		return bankerRepository.findAll();
	}
}
