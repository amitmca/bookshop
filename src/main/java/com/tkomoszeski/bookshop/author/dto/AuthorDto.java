package com.tkomoszeski.bookshop.author.dto;

import java.util.List;

import com.tkomoszeski.bookshop.base.dto.BaseDto;
import com.tkomoszeski.bookshop.book.dto.BookDto;

import lombok.Data;

@Data
public class AuthorDto extends BaseDto{
    
    private String firstName;
    private String lastName;
    private List<BookDto> books;
}