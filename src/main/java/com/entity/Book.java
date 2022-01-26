package com.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    private String bookName;

    private String bookAuthor;

    private String bookPublicationDate = LocalDate.now().toString();

    private String bookThumbnailImage;

    public static final List<Book> globalBookList = new ArrayList<Book>();

    public Book(String bookName, String bookAuthor, String bookPublicationDate, String bookThumbnailImage) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPublicationDate = bookPublicationDate;
        this.bookThumbnailImage = bookThumbnailImage;
    }

    public Book() {
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getBookAuthor() {
        return this.bookAuthor;
    }

    public String getBookPublicationDate() {
        return this.bookPublicationDate;
    }

    public String getBookThumbnailImage() {
        return this.bookThumbnailImage;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookPublicationDate(String bookPublicationDate) {
        this.bookPublicationDate = bookPublicationDate;
    }

    public void setBookThumbnailImage(String bookThumbnailImage) {
        this.bookThumbnailImage = bookThumbnailImage;
    }
}
