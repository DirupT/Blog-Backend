package com.brnd.blogposts.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Blog> blogs;

    public User(Long id, String username, String password, List<Blog> blogs) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.blogs = blogs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", blogs=" + blogs +
                '}';
    }
}