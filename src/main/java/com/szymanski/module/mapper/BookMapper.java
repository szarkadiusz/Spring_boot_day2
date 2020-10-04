package com.szymanski.module.mapper;

import com.szymanski.module.dto.BookDto;
import com.szymanski.module.entity.BooksDetailsEntity;
import com.szymanski.module.entity.BooksEntity;

import java.util.List;
import java.util.stream.Collectors;

public class BookMapper {

    public static BookDto map (BooksEntity entity){
        return new BookDto()
                .setAuthor(entity.getAuthor())
                .setTitle(entity.getTitle())
                .setDetails(BookDetailsMapper.map(entity.getDetails()))
                ;
    }

    public static List<BookDto> map(List<BooksEntity> entities){
        return entities
                .stream()
                .map(BookMapper::map)
                .collect(Collectors.toList());

    }
}
