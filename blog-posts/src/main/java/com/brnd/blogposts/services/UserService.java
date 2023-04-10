package com.brnd.blogposts.services;

import com.brnd.blogposts.models.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getUserById(long id);
}
