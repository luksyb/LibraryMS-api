package com.service;

import com.entity.Book;

import java.util.List;

public interface User {

    List<Book> getAll(String name, String author, String thumbnailImage);

    List<Book> getSortedBooks(String sortByParameter, String sortMethod);

    List<Book> searchBooks(String bookProperty, String bookValue);

}
