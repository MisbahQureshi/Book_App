package com.example.book.app.service;

import com.example.book.app.dto.BookDto;
import java.util.List;

public interface BookService {
    List<BookDto> findAll();
    BookDto findById(Long id);
    BookDto create(BookDto dto);
    BookDto update(Long id, BookDto dto);
    void delete(Long id);
}