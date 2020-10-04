package com.szymanski.module.dto;

public class BookDto {

    private int id;
    private String author;
    private String title;
    private BookDetailsDto details;

    public BookDetailsDto getDetails() {
        return details;
    }

    public BookDto setDetails(BookDetailsDto details) {
        this.details = details;
        return this;
    }

    public int getId() {
        return id;
    }

    public BookDto setId(int id) {
        this.id = id;
        return this;
    }


    public String getAuthor() {
        return author;
    }

    public BookDto setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BookDto setTitle(String title) {
        this.title = title;
        return this;
    }
}
