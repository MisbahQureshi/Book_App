package com.example.book.app.controller;

import com.example.book.app.dto.BookDto;
import com.example.book.app.service.BookService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookApiController {

    private final BookService service;

    public BookApiController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<BookDto> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public BookDto one(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public BookDto create(@Valid @RequestBody BookDto dto) {
        return service.create(dto);
    }

    @PutMapping("/{id}")
    public BookDto update(@PathVariable Long id, @Valid @RequestBody BookDto dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
