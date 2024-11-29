package com.microcare.microservice.microcare_microservice.services;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.microcare.microservice.microcare_microservice.db.BookJDBC;
import com.microcare.microservice.microcare_microservice.entity.Book;

@Service
public class BookService {
	
	
	public Book getBook(int bookid) throws SQLException {
		BookJDBC bookJDBC=new BookJDBC();
		
		return bookJDBC.getBook(bookid);
	}
	
	public boolean deleteBook(int bookid) throws SQLException {
		BookJDBC bookJDBC=new BookJDBC();
		
		return bookJDBC.deleteBook(bookid);
	}

}
