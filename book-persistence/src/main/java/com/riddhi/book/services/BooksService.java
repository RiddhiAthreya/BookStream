package com.riddhi.book.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.riddhi.book.domain.Book;

public interface BooksService {
    Book save(Book book);

    Page<Book> listBooks(Pageable pagable);

}
