package com.example.book.app.dto;

import jakarta.validation.constraints.NotBlank;

public class BookDto {
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String author;

    private Integer publishedYear;

    public BookDto() {}

    public BookDto(Long id, String title, String author, Integer publishedYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    // getters + setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public Integer getPublishedYear() { return publishedYear; }
    public void setPublishedYear(Integer publishedYear) { this.publishedYear = publishedYear; }
}
