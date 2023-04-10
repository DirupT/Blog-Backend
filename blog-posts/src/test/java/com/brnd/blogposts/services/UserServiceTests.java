package com.brnd.blogposts.services;

import com.brnd.blogposts.models.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserServiceTests {
    @Mock
    private UserService userService;

    @Test
    public void getUserById() {
        User user = new User("DirupT", "test");

        when(userService.getUserById(1)).thenReturn(Optional.of(user));

        Optional<User> fetchedUser = userService.getUserById(1);

        assertTrue(fetchedUser.isPresent());
        assertEquals(user, fetchedUser.get());

        Optional<User> nonExistentUser = userService.getUserById(999);
        assertFalse(nonExistentUser.isPresent());
    }
}
