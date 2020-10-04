package com.szymanski.module.books;

import com.szymanski.module.dto.BookDto;
import com.szymanski.module.entity.BooksEntity;
import com.szymanski.module.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BooksController {
    @Autowired
    private BooksRepository booksRepository;

    @GetMapping("/rest/books/{id}")
    public BookDto getBook(@PathVariable Long id) {
         BooksEntity booksEntity = booksRepository.findById(id).orElse(null);
        return BookMapper.map(booksEntity);
    }

    @GetMapping("/rest/books")
    public List<BookDto> getBooks() {

        List<BooksEntity> books = booksRepository.findAll();
        return BookMapper.map(books);
    }

    @PostMapping("/rest/books")
    public BookDto newBooks(@Valid @RequestBody BooksEntity booksEntity) {

        BooksEntity book= booksRepository.saveAndFlush(booksEntity);
        return BookMapper.map(book);
    }

    @DeleteMapping("/rest/books/{id}")
    public void delete(@PathVariable Long id) {
        booksRepository.deleteById(id);
    }

    @PutMapping("/rest/books/{id}")
    public BookDto updateBooks(@PathVariable Long id,
                                   @RequestBody BooksEntity booksEntity) {
        BooksEntity book = booksRepository.saveAndFlush(booksEntity.setId(id));
        return BookMapper.map(book);
    }

}




