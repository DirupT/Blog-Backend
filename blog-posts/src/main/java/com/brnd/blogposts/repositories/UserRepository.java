package com.brnd.blogposts.repositories;

import com.brnd.blogposts.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Blog, Long> {
}
