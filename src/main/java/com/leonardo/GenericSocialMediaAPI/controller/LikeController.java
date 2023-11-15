package com.leonardo.GenericSocialMediaAPI.controller;

import com.leonardo.GenericSocialMediaAPI.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController("/likes")
@RequiredArgsConstructor
public class LikeController {
    private final LikeService likeService;
}
