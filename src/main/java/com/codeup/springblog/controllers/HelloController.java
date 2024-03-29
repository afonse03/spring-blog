//// notes from the controllers lesson
//
//package com.codeup.springblog.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller // defines that our class is a controller
//public class HelloController {
//    @GetMapping("/hello") // defines a method that should be invoked when a GET request is received for the specified URI
//    @ResponseBody // tells Spring that whatever is returned from this method should be the body of our response
//    public String hello() {
//        return "Hello from Spring!";
//    }
//}