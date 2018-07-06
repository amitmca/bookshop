package com.tkomoszeski.bookshop.book.dto;


import com.tkomoszeski.bookshop.author.dto.AuthorDto;
import com.tkomoszeski.bookshop.base.dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;;

@Data
@EqualsAndHashCode(callSuper=true)
public class BookDto extends BaseDto
{
	private static final long serialVersionUID = 1432465078932032050L;
	private String title;
    private String description;
    private List<AuthorDto> authors;
}