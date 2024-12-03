package com.microcare.microservice.microcare_microservice.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/api/jpa/book")
	public String createBook(@RequestBody Book book) throws SQLException{
		bookService.createBook(book);
		
		return "Book Created ";
	}
	
	@PutMapping("/api/jpa/book")
	public String updateBook(@RequestBody Book book) throws SQLException{
		bookService.updateBook(book);
		
		return "Book Created ";
	}
	
	@GetMapping("/api/jpa/books")
	public List<Book> getBooks() throws SQLException{
		return bookService.getBooks();
		
		
	}
		
	
}
