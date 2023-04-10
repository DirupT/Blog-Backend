package com.brnd.blogposts.repositories;

import com.brnd.blogposts.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
