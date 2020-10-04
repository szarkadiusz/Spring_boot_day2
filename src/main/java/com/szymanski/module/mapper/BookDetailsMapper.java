package com.szymanski.module.mapper;

import com.szymanski.module.dto.BookDetailsDto;
import com.szymanski.module.entity.BooksDetailsEntity;

public class BookDetailsMapper {
    public static BookDetailsDto map (BooksDetailsEntity details){
        if(details == null){
            return new BookDetailsDto();
        }
        return new BookDetailsDto()
                .setIsbn(details.getIsbn())
                .setLang(details.getLang());
    }
}
