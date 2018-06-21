package com.tkomoszeski.bookshop.book.services;

import java.util.List;
import com.tkomoszeski.bookshop.author.dto.AuthorWithoutBooksDto;
import com.tkomoszeski.bookshop.book.dto.BookDto;

public interface IBookService{

    BookDto getBookById(Long id);
    BookDto getBookByTitle(String title);
    List<BookDto> getBooksByAuthors(AuthorWithoutBooksDto author);
}