package com.santhsoh.secureapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    // Display custom login page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // maps to login.html in templates folder
    }

    // Display registration page
    @GetMapping("/register")
    public String showRegisterPage() {
        return "register"; // maps to register.html in templates folder
    }
}
