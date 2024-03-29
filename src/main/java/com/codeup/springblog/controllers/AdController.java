//package com.codeup.springblog.controllers;
//
//import com.codeup.springblog.services.EmailService;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class AdController {
//
//    private final AdRespository adRespository;
//    private final EmailService emailService;
//    private final UserRepository userRepository;
//
//    public AdController(AdRepository adRepository, EmailService emailService, UserRepository userRepository) {
//        this.adRespository = adRepository;
//        this.emailService = emailService;
//        this.userRepository = userRepository;
//    }
//
//    @GetMapping("/ads")
//    @ResponseBody
//    public String showAds() {
//        return "Showing all the ads";
//    }
//
//    @GetMapping("/ads/{id}")
//    @ResponseBody
//    public String showSingleAd(@PathVariable long id) {
//        return "Showing ad: " + id;
//    }
//
//    @PostMapping("/ads")
//    @ResponseBody
//    public String createAd() {
//        return "Creating an ad";
//    }
//
////    @GetMapping("/color/{color}")
////    @ResponseBody
////    public String returnColor(@PathVariable String color) {
////        return "<h1 style='color:" + color + "'>" + color + "</h1>";
////    }
//}
