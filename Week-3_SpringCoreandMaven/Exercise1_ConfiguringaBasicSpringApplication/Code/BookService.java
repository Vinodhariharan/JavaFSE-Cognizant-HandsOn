package com.library.service;

import com.library.repo.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void printServiceMessage() {
        System.out.println("BookService: processing request...");
        bookRepository.printRepoMessage();
    }
}
