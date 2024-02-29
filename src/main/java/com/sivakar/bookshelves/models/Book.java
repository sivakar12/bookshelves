package com.sivakar.bookshelves.models;

public class Book {
    private String title;
    private Optional<Long> isbn;
    private List<String> authors;
    private Optional<Integer> publishedYear;
}
