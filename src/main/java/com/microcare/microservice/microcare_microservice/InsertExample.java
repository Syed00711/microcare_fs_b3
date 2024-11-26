package com.microcare.microservice.microcare_microservice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



import java.io.*;
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;
public class InsertExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	

		  String url
		          = "jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=/Users/sh030348/Desktop/microcare/Wallet_microcaredb3"; 
		      String username = ""; 
		      String password = "";
		     // String query
		       //   = "insert into books2 values(51,'DOTNET',null)"; 
		      
		    //  String query="update books2 set book_name='MICROCARE' where bookid=51";
		      
		      String query="delete from books2 where bookid=51";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				DriverManager.registerDriver(new OracleDriver());
				
				Connection con = DriverManager.getConnection(url,username,password);
		        Statement st = con.createStatement();
				int rs
		        = st.executeUpdate(query); // Execute query
				
				System.out.println("Rows Inserted"+rs);
		   


		    st.close(); // close statement
		    con.close(); // close connection
		    System.out.println("Connection Closed....");
			}

		


	}


