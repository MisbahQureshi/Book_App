package com.example.book.app.repository;

import com.example.book.app.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface BookRepository extends JpaRepository<Book, Long> {
    // You already get: save, findAll, findById, deleteById, etc.
    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Transactional
    @Query(""" 
            update Book b set
            b.title =:title,
            b.author = :author,
            b.publishedYear = :publishedYear
            where b.id =:id
            """)
    int updateBook(@Param("id") Long id,
                   @Param("title") String title,
                   @Param("author") String author,
                   @Param("publishedYear") Integer publishedYear);
}

