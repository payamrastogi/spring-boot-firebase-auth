package com.coddicted.firebaseauth.controller;

import com.coddicted.firebaseauth.model.User;
import com.coddicted.firebaseauth.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") String id) throws ExecutionException, InterruptedException {
        return userService.getUserById(id);
    }
}
