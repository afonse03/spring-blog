////**
//
//package com.codeup.springblog.controllers;
//
//import com.codeup.springblog.models.User;
//import com.codeup.springblog.repositories.UserRepository;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//public class UserController {
//    private UserRepository userDao;
//    private PasswordEncoder passwordEncoder;
//
//    public UserController(UserRepository userDao, PasswordEncoder passwordEncoder) {
//        this.userDao = userDao;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @GetMapping("/sign-up")
//    public String signupForm(Model model) {
//        model.addAttribute("user", new User());
//        return "users/sign-up";
//    }
//
//    @PostMapping("/sign-up")
//    public String saveUser(@ModelAttribute User user) {
//        String hash = passwordEncoder.encode(user.getPassword()); // created method getPassword in User
//        user.setPassword(hash); // created method setPassword in User
//        userDao.save(user);
//        return "redirect:/login";
//    }
//}
