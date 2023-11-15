package com.leonardo.GenericSocialMediaAPI.service;

import com.leonardo.GenericSocialMediaAPI.domain.Comments;
import com.leonardo.GenericSocialMediaAPI.repositories.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    public Comments comments(Long idUser, Long idPost, String commentText) {
        var comment = new Comments(idUser, idPost, commentText);
        return commentRepository.save(comment);
    }
}
