package com.leonardo.GenericSocialMediaAPI.controller;

import com.leonardo.GenericSocialMediaAPI.recods.CommentDTO;
import com.leonardo.GenericSocialMediaAPI.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController("/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    public ResponseEntity<CommentDTO> signUp(@RequestBody CommentDTO commentDTO, UriComponentsBuilder uriComponentsBuilder) {
        var comment = commentService.comments(commentDTO.idUser(), commentDTO.idPost(), commentDTO.commentsText());
        var uri = uriComponentsBuilder.path("/comments/{id}").buildAndExpand(comment.getId()).toUri();

        return ResponseEntity.created(uri).body(commentDTO);

    }
}
