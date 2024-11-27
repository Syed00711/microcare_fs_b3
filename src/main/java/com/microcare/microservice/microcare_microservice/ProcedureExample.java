package com.microcare.microservice.microcare_microservice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleDriver;

public class ProcedureExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 String url
         = "jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=/Users/sh030348/Desktop/microcare/Wallet_microcaredb3"; 
     String username = "ADMIN"; 
     String password = "";
     
     int i=21;
   // String query
    //    = "insert into books2 values(?,?,?)"; 
     String query="select micro(?) from dual";
   //  String query="update books2 set book_name='MICROCARE' where bookid=51";
     
    // String query="delete from books2 where bookid=?";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.registerDriver(new OracleDriver());
		
		Connection con = DriverManager.getConnection(url,username,password);
       CallableStatement cs = con.prepareCall("{call first_proc(?,?,?)}");
       cs.setInt(1, 1);
       cs.setInt(2, 9);
      // cs.registerOutParameter(2, Types.BIGINT); 
       cs.registerOutParameter(3, Types.VARCHAR); 
       
      // st.setInt(2, 45);
       //st.setString(2,"Academy");
      // st.setNull(3, Types.INTEGER);
		
       cs.execute(); // Execute query
       System.out.println("procedure output"+cs.getInt(2));
		System.out.println("procedure output"+cs.getString(3));



   cs.close(); // close statement
   con.close(); // close connection
   System.out.println("Connection Closed....");


	}

}
