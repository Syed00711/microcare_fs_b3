package com.microcare.microservice.microcare_microservice.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microcare.microservice.microcare_microservice.entity.Book;
import com.microcare.microservice.microcare_microservice.services.BookService;

@RestController
public class BooksController {
	@Autowired
	BookService bookService;
	
	@GetMapping("/api/book/{bookid}")
	public Book getBook(@PathVariable int bookid) throws SQLException {
		return bookService.getBook(bookid);
	}
	
	@DeleteMapping("/api/book/{bookid}")
	public String deleteBook(@PathVariable int bookid) throws SQLException {
		if(bookService.deleteBook(bookid)) {
			return "Book deleted SUccessfully";
		}
		else {
			return "Book deletion failed";
		}
	}
}
