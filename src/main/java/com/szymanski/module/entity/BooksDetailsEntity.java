package com.szymanski.module.entity;

import javax.persistence.*;

@Entity
@Table (name ="books_details")
public class BooksDetailsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isbn;
    private String publisher;
    private String lang;

    public String getLang() {
        return lang;
    }

    public Long getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }
}
