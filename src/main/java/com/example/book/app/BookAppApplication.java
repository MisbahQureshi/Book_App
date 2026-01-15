package com.example.book.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookAppApplication {

    public static void main(String[] args) {
        System.out.println(">>> main started");
        SpringApplication.run(BookAppApplication.class, args);
        System.out.println(">>> SpringApplication.run returned");
    }

}
