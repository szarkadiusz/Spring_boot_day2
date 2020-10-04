package com.szymanski.module.dto;

public class BookDto {

    private int id;

    public int getId() {
        return id;
    }

    public BookDto setId(int id) {
        this.id = id;
        return this;
    }

    private String author;
    private String title;

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
