package com.leonardo.GenericSocialMediaAPI.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idUser;
    private Long idPost;
    private String commentsText;
    private LocalDateTime commentsTime;

    public Comments(Long idUser, Long idPost, String commentsText) {
        this.idUser = idUser;
        this.idPost = idPost;
        this.commentsText = commentsText;
        this.commentsTime = LocalDateTime.parse(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:ss")));
    }
}
