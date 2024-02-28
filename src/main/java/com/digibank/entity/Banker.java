package com.digibank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Banker {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long bankerId;
private String firstName;
private String lastName;
private String email;
private String phno;
private String password;
}
