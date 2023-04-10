package com.brnd.blogposts.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class BlogServiceTests {
    @Mock
    private BlogService blogService;

    @Test
    public void getAllBlogs() {
        
    }
}
