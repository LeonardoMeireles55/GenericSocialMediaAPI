package com.leonardo.GenericSocialMediaAPI.service;

import com.leonardo.GenericSocialMediaAPI.domain.Likes;
import com.leonardo.GenericSocialMediaAPI.repositories.LikeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LikeService {
    private final LikeRepository likeRepository;

    private Likes likes(Long postId, Long userId) {
        var like = new Likes(postId, userId);
        return likeRepository.save(like);
    }
}
