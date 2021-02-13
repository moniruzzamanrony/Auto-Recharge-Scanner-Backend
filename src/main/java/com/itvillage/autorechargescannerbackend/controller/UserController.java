package com.itvillage.autorechargescannerbackend.controller;

import com.itvillage.autorechargescannerbackend.dto.request.UserRequest;
import com.itvillage.autorechargescannerbackend.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/users/add")
    public ResponseEntity<String> addNewUser(@RequestBody UserRequest userRequest)
    {
       return userService.addNewUser(userRequest);
    }
}
