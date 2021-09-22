package com.basaki.react.config;

import com.basaki.react.data.entity.Book;
import com.basaki.react.data.repository.BookRepository;
import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BookCommandLineRunner implements CommandLineRunner {

    private final BookRepository repository;

    public BookCommandLineRunner(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Stream.of("To Kill a Mockingbird",
                        "The Catcher in the Rye",
                        "The Outsiders",
                        "Harry Potter and the Sorcerer's Stone",
                        "Charlotte's Web",
                        "David Copperfield",
                        "The Secret Life of Bees")
                .forEach(name -> repository.save(new Book(name))
                );
        repository.findAll().forEach(System.out::println);
    }
}
