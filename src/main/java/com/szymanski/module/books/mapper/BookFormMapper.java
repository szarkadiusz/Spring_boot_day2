package com.szymanski.module.books.mapper;

import com.szymanski.module.books.dto.BookForm;
import com.szymanski.module.books.entity.BooksDetailsEntity;
import com.szymanski.module.books.entity.BooksEntity;
import com.szymanski.module.books.entity.BooksTagsEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class BookFormMapper {

    public static BooksEntity map (BookForm form){
        BooksEntity entity = new BooksEntity();
        entity.setTitle(form.getTitle())
                .setAuthor(form.getAuthor())
                .setDetails(getDetails(form))
                .setTags(getTags(form,entity));
                return entity;

    }

    private static Set<BooksTagsEntity> getTags(BookForm form, BooksEntity entity) {
        return form.getTags()
                .stream()
                .map(tag->new BooksTagsEntity().setValue(tag).setBook(entity))
                .collect(Collectors.toSet());
    }

    public static BooksDetailsEntity getDetails (BookForm form) {
        return new BooksDetailsEntity()
                .setIsbn(form.getIsbn())
                .setLang(form.getLang());
    }


    }
