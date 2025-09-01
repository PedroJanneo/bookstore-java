package com.bookStoreJava.BookStoreJava.controllers;


import com.bookStoreJava.BookStoreJava.entities.Book;
import com.bookStoreJava.BookStoreJava.entities.User;
import com.bookStoreJava.BookStoreJava.repositories.UserRepository;
import com.bookStoreJava.BookStoreJava.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAlL(){
        List<User> result =  userService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id){
        User result = userService.findByID(id);
        return result;
    }
}
