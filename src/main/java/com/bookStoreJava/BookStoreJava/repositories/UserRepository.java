package com.bookStoreJava.BookStoreJava.repositories;

import com.bookStoreJava.BookStoreJava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
