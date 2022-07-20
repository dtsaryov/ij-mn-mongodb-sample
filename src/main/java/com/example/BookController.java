package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Controller("/books")
public class BookController {

    @Inject
    private BookRepository bookRepository;

    @Get("/all")
    public String getAll() {
        return prepareResponse(bookRepository.findAll());
    }

    @Get("/tolkien")
    public String getTolkienBooks() {
        return prepareResponse(bookRepository.findTolkienBooks());
    }

    @Get("/martin")
    public String getMartinBooks() {
        return prepareResponse(bookRepository.findMartinBooks());
    }

    @Get("/old")
    public String getOldBooks() {
        return prepareResponse(bookRepository.findOldBooks());
    }

    @Get("/90")
    public String getBooksFrom90s() {
        return prepareResponse(bookRepository.findBooksPublishedBetween("1990", "2000"));
    }

    private static String prepareResponse(Iterable<Book> books) {
        return StreamSupport.stream(books.spliterator(), false)
                .map(Book::toString)
                .collect(Collectors.joining(",\n"));
    }
}
