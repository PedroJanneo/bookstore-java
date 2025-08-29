package com.bookStoreJava.BookStoreJava.controllers;


import com.bookStoreJava.BookStoreJava.entities.Book;
import com.bookStoreJava.BookStoreJava.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> findAll(){
        List<Book> result = bookService.findAll();
        return result;

    }

    @GetMapping(value = "/{id}")
    public Book findById(@PathVariable Long id){
        Book result = bookService.findByID(id);
        return result;
    }

}
