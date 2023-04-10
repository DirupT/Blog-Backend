package com.brnd.blogposts.services;

import com.brnd.blogposts.models.User;
import com.brnd.blogposts.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserServiceTests {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void getUserById() {
        User user = new User("DirupT", "test");

        when(userRepository.findById(1L)).thenReturn(Optional.of(user));

        Optional<User> fetchedUser = userService.getUserById(1L);

        assertTrue(fetchedUser.isPresent());
        assertEquals(user, fetchedUser.get());

        Optional<User> nonExistentUser = userService.getUserById(999L);
        assertFalse(nonExistentUser.isPresent());
    }
}
