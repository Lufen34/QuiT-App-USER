package com.quitapp.user.controller;

import com.quitapp.user.payloads.requests.RegisterUserPayload;
import com.quitapp.user.payloads.responses.MessageResponse;
import com.quitapp.user.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<MessageResponse> register(RegisterUserPayload payload) {
        return userService.save(payload);
    }
}
