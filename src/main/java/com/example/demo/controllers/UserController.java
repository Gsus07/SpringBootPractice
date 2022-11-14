package com.example.demo.controllers;
import com.example.demo.models.UserModel;
import com.example.demo.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ArrayList<UserModel> searchAll(){
        return userService.searchAll();
    }

    @PostMapping
    public UserModel save(@RequestBody UserModel user){
        return this.userService.save(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> findById(@PathVariable("id") Long id){
        return this.userService.findById(id);
    }

    @GetMapping("/query")
    public ArrayList<UserModel> findByPriority(@RequestParam("priority") Integer priority){
        return  this.userService.findByPriority(priority);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUser(id);
        if (ok){
            return "Delete user with the id:" +id;
        }else {
            return "Could not delete user with id:" +id;
        }

    }
}
