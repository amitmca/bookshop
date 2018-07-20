package com.tkomoszeski.bookshop.book.api;

import javax.transaction.Transactional;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
@RequestMapping(value = "api/books")
public class BookController{
            
    @RequestMapping("hello")
    public String hello()
    {
        return "Hello World! Rest Api is working!";
    }
   
}