package com.example.book.app.repository;

import com.example.book.app.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // You already get: save, findAll, findById, deleteById, etc.
}

