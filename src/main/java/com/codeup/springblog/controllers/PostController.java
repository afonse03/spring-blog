package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

//    private final PostRepository postRepository;
//    private final UserRepository userRepository;
//    private final EmailService emailService;
//
//    public PostController(PostRepository postRepository, UserRepository userRepository, EmailService emailService) {
//        this.postRepository = postRepository;
//        this.userRepository = userRepository;
//        this.emailService = emailService;
//    }

    @GetMapping("/posts")
    @ResponseBody
    public String postsIndex() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String individualPost(@PathVariable long id) {
        return "view an individual post" + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "view the form for creating a post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String newPost() {
        return "create a new post";
    }
}
