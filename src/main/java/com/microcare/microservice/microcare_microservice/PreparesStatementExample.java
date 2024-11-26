package com.microcare.microservice.microcare_microservice;

import java.io.*;
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;
public class PreparesStatementExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 String url
         = "jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=/Users/sh030348/Desktop/microcare/Wallet_microcaredb3"; 
     String username = ""; 
     String password = "";
     
     int i=21;
   // String query
    //    = "insert into books2 values(?,?,?)"; 
     String query="select bookid,book_name from books2 where bookid in (?,?)";
   //  String query="update books2 set book_name='MICROCARE' where bookid=51";
     
    // String query="delete from books2 where bookid=?";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.registerDriver(new OracleDriver());
		
		Connection con = DriverManager.getConnection(url,username,password);
       PreparedStatement st = con.prepareStatement(query);
       
       st.setInt(1, 99);
       st.setInt(2, 45);
       //st.setString(2,"Academy");
      // st.setNull(3, Types.INTEGER);
		ResultSet rs
       = st.executeQuery(); // Execute query
		
		System.out.println("Rows Inserted"+rs);
  while(rs.next()) {
	  System.out.println(rs.getInt("bookid"));
	  System.out.println(rs.getString("BOOK_NAME"));
  }


   st.close(); // close statement
   con.close(); // close connection
   System.out.println("Connection Closed....");

	}

}
