package com.szymanski.module.books.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Set;
@XmlRootElement
public class BookDto {

    private int id;
    private String author;
    private String title;
    private BookDetailsDto details;
    private Set<String> tags;

    public Set<String> getTags() {
        return tags;
    }

    public BookDto setTags(Set<String> tags) {
        this.tags = tags;
        return this;
    }

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
