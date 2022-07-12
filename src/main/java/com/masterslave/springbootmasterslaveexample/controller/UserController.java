package com.masterslave.springbootmasterslaveexample.controller;

import com.masterslave.springbootmasterslaveexample.entity.User;
import com.masterslave.springbootmasterslaveexample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author : Ragil Gilang Maulana
 * @Date : 11/07/22
 **/

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }



    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


}
