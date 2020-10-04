package com.szymanski.module.blog;

import java.util.UUID;

public class PostDto {
    private String uuid;
    private String tittle;
    private String text;

    public PostDto(String uuid, String tittle, String text) {
        this.uuid = uuid;
        this.tittle = tittle;
        this.text = text;
    }

    public PostDto( String tittle, String text) {
        this.uuid = UUID.randomUUID().toString();
        this.tittle = tittle;
        this.text = text;
    }

    public String getUuid() {
        return uuid;
    }

    public String getTittle() {
        return tittle;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "uuid='" + uuid + '\'' +
                ", tittle='" + tittle + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
