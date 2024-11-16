package com.microcare.microservice.microcare_microservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.io.*;
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

public class CHeckDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//c://Users//HP//DOwnloads//Wallet_microcaredb3
		  String url
          = "jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=/Users/sh030348/Desktop/microcare/Wallet_microcaredb3"; 
      String username = ""; 
      String password = "";
      String query
          = "select bookid,book_name from books2 where bookid<30"; 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.registerDriver(new OracleDriver());
		
		Connection con = DriverManager.getConnection(url,username,password);
        Statement st = con.createStatement();
		ResultSet rs
        = st.executeQuery(query); // Execute query
		
		while(rs.next()) {
			System.out.println(rs.getInt("bookid"));
			System.out.println(rs.getString("book_name"));
		
		}
   


    st.close(); // close statement
    con.close(); // close connection
    System.out.println("Connection Closed....");
	}

}
