package com.leonardo.GenericSocialMediaAPI.repositories;

import com.leonardo.GenericSocialMediaAPI.domain.Likes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Likes, Long> {

}

