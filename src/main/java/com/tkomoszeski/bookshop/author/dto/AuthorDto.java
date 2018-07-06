package com.tkomoszeski.bookshop.author.dto;

import java.util.List;

import com.tkomoszeski.bookshop.base.dto.BaseDto;
import com.tkomoszeski.bookshop.book.dto.BookDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class AuthorDto extends BaseDto{
	
	private static final long serialVersionUID = 5862910438779927128L;
	private String firstName;
    private String lastName;
    private List<BookDto> books;
}