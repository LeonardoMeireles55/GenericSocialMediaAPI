package com.leonardo.GenericSocialMediaAPI.repositories;

import com.leonardo.GenericSocialMediaAPI.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {

}
