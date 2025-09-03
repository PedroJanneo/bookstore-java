package com.bookStoreJava.BookStoreJava.services;

import com.bookStoreJava.BookStoreJava.entities.User;
import com.bookStoreJava.BookStoreJava.repositories.UserRepository;
import com.bookStoreJava.BookStoreJava.security.PasswordHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public User save(User user){
        String hash = PasswordHash.hash(user.getPassword());
        user.setPassword(hash);
        return userRepository.save(user);
    }

    public List<User> findAll(){
        return  userRepository.findAll();
    }

    public User findByID(Long id){
        User result = userRepository.findById(id).get();
        return result;
    }
}
