package com.fm.jdbc.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

// TODO: implement this using an in memory db
// use a map as an in-memory database
public class BookJdbcInMemoryDao implements BookRepository {

    private static Map<Long, Book> db = new HashMap<>();

    @Override
    public Book create(Book book) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public List<Book> findByAuthor(String author) {
       return null;
    }

    @Override
    public Optional<Book> findById(Long id) {
        return null;
    }

    @Override
    public Optional<Book> findByTitle(String title) {
        return null;
    }

    @Override
    public Book update(Long id, Book book) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }

}
