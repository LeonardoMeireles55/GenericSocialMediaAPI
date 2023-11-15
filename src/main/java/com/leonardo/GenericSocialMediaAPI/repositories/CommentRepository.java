package com.leonardo.GenericSocialMediaAPI.repositories;

import com.leonardo.GenericSocialMediaAPI.domain.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comments, Long> {

}
