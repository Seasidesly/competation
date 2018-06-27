package com.kunpeng.competition.service.impl;

import com.kunpeng.competition.domain.Book;
import com.kunpeng.competition.domain.BookRepository;
import com.kunpeng.competition.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Book 业务层实现
 *
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book insertByBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book delete(Long id) {
        Book book = bookRepository.findById(id).get();
        bookRepository.delete(book);
        return book;
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).get();
    }
}
