package com.logikcode.springoauth2andsocial.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    @GetMapping("/home")
    public ResponseEntity<?> welcomeMessage(){

        return ResponseEntity.ok().body("Welcome to home page");
    }
}
