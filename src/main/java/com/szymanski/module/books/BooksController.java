package com.szymanski.module.books;

import com.szymanski.module.books.repository.BooksRepository;
import com.szymanski.module.books.dto.BookDto;
import com.szymanski.module.books.dto.BookForm;
import com.szymanski.module.books.entity.BooksEntity;
import com.szymanski.module.books.mapper.BookFormMapper;
import com.szymanski.module.books.mapper.*;
import com.szymanski.module.books.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BooksController {
    @Autowired
    private BooksService booksService;

    @GetMapping("/rest/books/{id}")
    public BookDto getBook(@PathVariable Long id) {
         BooksEntity booksEntity = booksService.getOne(id);
        return BookMapper.map(booksEntity);
    }

    @GetMapping("/rest/books")
    public List<BookDto> getBooks() {

        List<BooksEntity> books = booksService.getAll();
        return BookMapper.map(books);
    }

    @PostMapping("/rest/books")
    public BookDto newBooks(@Valid @RequestBody BookForm bookForm) {
        BooksEntity book= BookFormMapper.map(bookForm);
        book = booksService.create(book);
        return BookMapper.map(book);
    }

    @DeleteMapping("/rest/books/{id}")
    public void delete(@PathVariable Long id) {
        booksService.delete(id);
    }

    @PutMapping("/rest/books/{id}")
    public BookDto updateBooks(@PathVariable Long id,
                                   @RequestBody BooksEntity booksEntity) {
        BooksEntity book = booksService.update(id,booksEntity);
        return BookMapper.map(book);
    }

}




