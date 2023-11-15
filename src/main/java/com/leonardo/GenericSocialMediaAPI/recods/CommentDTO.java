package com.leonardo.GenericSocialMediaAPI.recods;

public record CommentDTO(
        Long idUser,
        Long idPost,
        String commentsText
) {
}
