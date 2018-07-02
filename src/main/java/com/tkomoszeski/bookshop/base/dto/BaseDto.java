package com.tkomoszeski.bookshop.base.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public abstract class BaseDto implements Serializable{

    private static final long serialVersionUID = -8125407295150617450L;
	private Long id;
    private Date techDate;

}