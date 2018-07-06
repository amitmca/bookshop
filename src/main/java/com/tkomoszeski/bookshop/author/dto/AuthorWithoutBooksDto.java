package com.tkomoszeski.bookshop.author.dto;

import com.tkomoszeski.bookshop.base.dto.BaseDto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class AuthorWithoutBooksDto extends BaseDto{

    private static final long serialVersionUID = -6303764782633577370L;
	private String firstname;
    private String lastname;
}
