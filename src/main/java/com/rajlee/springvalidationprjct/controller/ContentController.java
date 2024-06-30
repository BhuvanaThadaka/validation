package com.rajlee.springvalidationprjct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentController {
    @GetMapping("/home")
    public String handleWelcome() {
        return "Home Page";
    }

    @GetMapping("/admin/home")
    public String handleAdminHome() {
        return "Admin Page";
    }

    @GetMapping("/user/home")
    public String handleUserHome() {
        return "User Page";
    }
}
