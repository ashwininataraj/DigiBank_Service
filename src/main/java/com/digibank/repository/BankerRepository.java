package com.digibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digibank.entity.Banker;
@Repository
public interface BankerRepository extends JpaRepository<Banker, Long> {
Banker findBankerByBankerId(Long bankerId);
Banker findBankerByEmail(String email);

}
