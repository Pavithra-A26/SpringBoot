package com.bookstore.services;

import com.bookstore.entity.Books;
import com.bookstore.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    //get method
    public List<Books> getBooks(){

        return bookRepository.findAll();
    }

    public  Books getBookById(int Id){
        return bookRepository.findById(Id).orElseThrow();
    }

    public Books addBooks(Books book){

        return  bookRepository.save(book);
    }

    public Books UpdateBooks(int Id,Books model){
        Books books=bookRepository.findById(Id).orElseThrow();
        books.setBookname(model.getBookname());
        books.setDesc(model.getDesc());
        books.setYearofpublication(model.getYearofpublication());
        return bookRepository.save(books);
    }

    public void deletebook(int Id){
        bookRepository.deleteById(Id);
    }

}
