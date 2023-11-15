package com.leonardo.GenericSocialMediaAPI.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.text.DateFormat;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private String date_birth;
    private String email;
    private String password;

    public User(String name, String cpf, String date_birth, String email, String password) {
        this.name = name;
        this.cpf = cpf;
        this.date_birth = date_birth;
        this.email = email;
        this.password = password;
    }
}
