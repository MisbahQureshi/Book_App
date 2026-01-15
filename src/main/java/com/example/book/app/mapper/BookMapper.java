package com.example.book.app.mapper;

import com.example.book.app.dto.BookDto;
import com.example.book.app.entity.Book;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDto toDto(Book book);
    Book toEntity(BookDto dto);
    List<BookDto> toDtoList(List<Book> books);
}
