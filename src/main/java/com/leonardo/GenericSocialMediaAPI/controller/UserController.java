package com.leonardo.GenericSocialMediaAPI.controller;

import com.leonardo.GenericSocialMediaAPI.records.AuthDataDTO;
import com.leonardo.GenericSocialMediaAPI.service.CommentService;
import com.leonardo.GenericSocialMediaAPI.service.LikeService;
import com.leonardo.GenericSocialMediaAPI.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    public ResponseEntity<AuthDataDTO> signUp
            (@RequestBody AuthDataDTO authDataDTO, UriComponentsBuilder uriComponentsBuilder) {
        var user = userService
                .signUp(authDataDTO.name(), authDataDTO.cpf(), authDataDTO.date_birth(),
                        authDataDTO.email(), authDataDTO.password());
        var uri = uriComponentsBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri();
            return ResponseEntity.created(uri).body(authDataDTO);
    }
}
