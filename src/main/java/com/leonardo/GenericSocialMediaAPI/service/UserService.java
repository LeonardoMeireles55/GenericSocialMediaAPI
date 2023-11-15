package com.leonardo.GenericSocialMediaAPI.service;

import com.leonardo.GenericSocialMediaAPI.domain.User;
import com.leonardo.GenericSocialMediaAPI.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public User signUp(String name, String cpf, String date_birth, String email, String password) {
        var user = new User(name, cpf, date_birth, email, password);

        return userRepository.save(user);
    }
}
