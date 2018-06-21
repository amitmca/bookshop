package com.tkomoszeski.bookshop.book.ob;

import java.util.List;


import javax.persistence.Entity;
import javax.validation.constraints.*;
import javax.persistence.*;
import com.tkomoszeski.bookshop.author.ob.Author;
import com.tkomoszeski.bookshop.base.ob.BaseOb;
import java.lang.Integer;

import lombok.Data;



@Entity
@Data
@Table(name = "books")
public class Book extends BaseOb {

    private static final long serialVersionUID = 1448228395362232378L;
    
    @ManyToMany(
        fetch = FetchType.EAGER, 
        cascade = {CascadeType.PERSIST,CascadeType.MERGE}
    )
    @JoinTable(
        name="book_author", 
        joinColumns = {@JoinColumn(name="book_id")},
        inverseJoinColumns = {@JoinColumn(name="author_id")} 
        )
    private List<Author> authors;
    

    @NotNull
    @Size(max = 200)
    @Column(unique = true)
    private String title;
    
    private String description;
    private Integer price;
} 