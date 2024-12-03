package com.microcare.microservice.microcare_microservice.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microcare.microservice.microcare_microservice.entity.Book;
import com.microcare.microservice.microcare_microservice.repo.BookRepo;

@Component
public class BookJPADB {
	
	@Autowired
	public BookRepo bookRepo;
	
	
	public boolean insertBook(Book book) {
		if(bookRepo.save(book)!=null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean updateBook(Book book) {
		if(bookRepo.save(book)!=null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public List<Book> getAllBooks(){
		return bookRepo.findAll();
	}

}
