package com.example.book.app.service;

import com.example.book.app.dto.BookDto;
import com.example.book.app.entity.Book;
import com.example.book.app.mapper.BookMapper;
import com.example.book.app.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository repo;
    private final BookMapper mapper;

    public BookServiceImpl(BookRepository repo, BookMapper mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    public List<BookDto> findAll() {
        return mapper.toDtoList(repo.findAll());
    }

    @Override
    public BookDto findById(Long id) {
        Book book = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found: " + id));
        return mapper.toDto(book);
    }

    @Override
    public BookDto create(BookDto dto) {
        Book saved = repo.save(mapper.toEntity(dto));
        return mapper.toDto(saved);
    }

    @Override
    public BookDto update(Long id, BookDto dto) {

        int updated = repo.updateBook(id, dto.getTitle(), dto.getAuthor(), dto.getPublishedYear());
        if(updated == 0) throw new RuntimeException("Book not found " + id);
        dto.setId(id);
        return dto;
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}

