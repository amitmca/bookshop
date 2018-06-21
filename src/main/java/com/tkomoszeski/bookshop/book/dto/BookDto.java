package com.tkomoszeski.bookshop.book.dto;


import com.tkomoszeski.bookshop.author.dto.AuthorDto;
import com.tkomoszeski.bookshop.base.dto.BaseDto;

import lombok.Data;

import java.util.List;;

@Data
public class BookDto extends BaseDto
{

	private static final long serialVersionUID = 1L;
    
    private String title;
    private String description;
    private List<AuthorDto> authors;
}