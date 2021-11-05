package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
    @GetMapping("/posts")
    public String postsIndex() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    public String individualPost() {
        return "view an individual post";
    }

    @GetMapping("/posts/create")
    public String createPost() {
        return "view the form for creating a post";
    }

    @GetMapping("/posts/create")
    public String newPost() {
        return "create a new post";
    }
}
