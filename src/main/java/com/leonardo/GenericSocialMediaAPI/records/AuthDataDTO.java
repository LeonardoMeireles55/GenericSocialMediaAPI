package com.leonardo.GenericSocialMediaAPI.records;

public record AuthDataDTO(
        String name,
        String cpf,
        String date_birth,
        String email,
        String password
) {
}