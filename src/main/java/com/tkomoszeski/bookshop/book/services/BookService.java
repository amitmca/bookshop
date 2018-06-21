package com.tkomoszeski.bookshop.book.services;

import java.util.List;

import com.tkomoszeski.bookshop.author.dto.AuthorWithoutBooksDto;
import com.tkomoszeski.bookshop.book.dto.BookDto;

public class BookService implements IBookService {

	@Override
	public BookDto getBookById(Long id) {
		return null;
	}

	@Override
	public BookDto getBookByTitle(String title) {
		return null;
	}

	@Override
	public List<BookDto> getBooksByAuthors(AuthorWithoutBooksDto author) {
		return null;
	}

}