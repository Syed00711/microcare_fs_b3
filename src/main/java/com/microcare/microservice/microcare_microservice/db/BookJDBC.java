package com.microcare.microservice.microcare_microservice.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.microcare.microservice.microcare_microservice.entity.Book;

import oracle.jdbc.driver.OracleDriver;


public class BookJDBC {
	
	
	public Connection getConnection() {
		 String url
         = "jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=/Users/sh030348/Desktop/microcare/Wallet_microcaredb3"; 
     String username = "ADMIN"; 
     String password = "Microcaredb3";
     Connection connection=null;
     String query
         = "select bookid,book_name from books2 where bookid<30"; 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			DriverManager.registerDriver(new OracleDriver());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			connection= DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
     
	}
	
	
	public Book getBook(int bookid) throws SQLException {
		Book book=new Book();
		
		Connection connection=getConnection();
		String query="select * from books where bookid=?";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setInt(1, bookid);
		
		ResultSet rs= ps.executeQuery();
		
		while(rs.next()) {
			book.setBookid(rs.getInt("bookid"));
			book.setTitle(rs.getString("title"));
			book.setAuthor(rs.getString("author"));
			book.setPrice(rs.getDouble("price"));
			book.setPublishedyear(rs.getInt("publishedyear"));
		}
		return book;
	}
	
	public boolean deleteBook(int bookid) throws SQLException {
		Book book=new Book();
		
		Connection connection=getConnection();
		String query="delete from books where bookid=?";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setInt(1, bookid);
		
		int rs= ps.executeUpdate();
		
		if(rs==1)
			return true;
			else 
				return false;
		
	}

}
