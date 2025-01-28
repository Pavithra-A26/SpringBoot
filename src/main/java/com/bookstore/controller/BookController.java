package com.bookstore.controller;

import com.bookstore.entity.Books;
import com.bookstore.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/getbooks")
    public List<Books> getbooks(){

        return bookService.getBooks();
    }

    @GetMapping("GetById/{id}")
    public ResponseEntity<Books> GetById(@PathVariable  int Id){
        Books employee=bookService.getBookById(Id);
        if(employee!=null){
            return ResponseEntity.ok(employee);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/addbooks")
    public  ResponseEntity<Books> addBooks(@RequestBody Books book){
        Books books = bookService.addBooks(book);
        if(books!=null){
            return ResponseEntity.ok(books);
        }else{
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Books> UpdateEmployee(@PathVariable int id,@RequestBody Books model){
        Books book=bookService.UpdateBooks(id,model);
        if(book!=null){
            return ResponseEntity.ok(book);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/delete/{id}")
    public void DeleteBook(@PathVariable int id){
        bookService.deletebook(id);
    }
}
