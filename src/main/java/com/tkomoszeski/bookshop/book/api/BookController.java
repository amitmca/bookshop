package com.tkomoszeski.bookshop.book.api;

import javax.transaction.Transactional;

import com.tkomoszeski.bookshop.book.services.IBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
@RequestMapping(value = "api/books")
public class BookController{
            
    @Autowired
    IBookService bookService;
}