package com.szymanski.module.blog;

public class PostForm {
    public String tittle;
    public String text;

    public String getTittle() {
        return tittle;
    }

    public PostForm setTittle(String tittle) {
        this.tittle = tittle;
        return this;
    }

    public String getText() {
        return text;
    }

    public PostForm setText(String text) {
        this.text = text;
        return this;
    }
}
