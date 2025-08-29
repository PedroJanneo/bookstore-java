package com.bookStoreJava.BookStoreJava.services;


import com.bookStoreJava.BookStoreJava.entities.Book;
import com.bookStoreJava.BookStoreJava.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findByID(Long id){
        Book result = bookRepository.findById(id).get();
        return result;
    }
}



