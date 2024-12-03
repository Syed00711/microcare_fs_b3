package com.microcare.microservice.microcare_microservice.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microcare.microservice.microcare_microservice.db.BookJDBC;
import com.microcare.microservice.microcare_microservice.db.BookJPADB;
import com.microcare.microservice.microcare_microservice.entity.Book;

@Service
public class BookService {
	
	@Autowired
	BookJPADB bookJPA;
	public Book getBook(int bookid) throws SQLException {
		BookJDBC bookJDBC=new BookJDBC();
		
		return bookJDBC.getBook(bookid);
	}
	
	public boolean deleteBook(int bookid) throws SQLException {
		BookJDBC bookJDBC=new BookJDBC();
		
		return bookJDBC.deleteBook(bookid);
	}
	
	public boolean createBook(Book book) throws SQLException {
		
		
		return bookJPA.insertBook(book);
	}
	
public boolean updateBook(Book book) throws SQLException {
		
		
		return bookJPA.updateBook(book);
	}

public List<Book> getBooks() throws SQLException {
	
	
	return bookJPA.getAllBooks();
}

}
