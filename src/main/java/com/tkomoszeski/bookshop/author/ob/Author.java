package com.tkomoszeski.bookshop.author.ob;


import java.util.List;

import javax.persistence.*;

import com.tkomoszeski.bookshop.base.ob.BaseOb;
import com.tkomoszeski.bookshop.book.ob.Book;

import lombok.Data;



@Entity
@Data
@Table(name = "authors")
public class Author extends BaseOb{

    private String firstName;
    private String lastName;

    @ManyToMany(fetch = FetchType.LAZY,cascade={CascadeType.PERSIST,CascadeType.MERGE},mappedBy="authors")
    private List<Book> books;

}