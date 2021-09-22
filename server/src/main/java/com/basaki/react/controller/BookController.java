package com.basaki.react.controller;

import com.basaki.react.data.entity.Book;
import com.basaki.react.data.repository.BookRepository;
import java.util.Collection;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/books")
    @CrossOrigin(origins = "http://localhost:3000")
    public Collection<Book> getBooks() {
        return repository.findAll();
    }
}
