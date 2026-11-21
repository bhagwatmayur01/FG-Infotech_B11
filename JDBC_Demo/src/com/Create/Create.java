package com.Create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) {

		try {
      //Load the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
	  //Create the object of connection
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","System");
 
		//We need to create the object of statement interface
		Statement stmt=con.createStatement();
		
		//create a new record we required SQL insert Query
		String insertQuery="Insert into TEST values(1,'Mayur')";
		int i= stmt.executeUpdate(insertQuery);
		System.out.println(i+"Row(s) inserted successfully using Statement interface.");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
