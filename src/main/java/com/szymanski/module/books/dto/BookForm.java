package com.szymanski.module.books.dto;

import java.util.List;

public class BookForm {
    private String author;
    private String title;
    private String isbn;
    private List<String> tags;

    public List<String> getTags() {
        return tags;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getLang() {
        return lang;
    }

    private String lang;

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }


}
