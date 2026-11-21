package com.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StmtDemo {

	public static void main(String[] args) {
		
		try {
		//Register the Driver Class ojdo
	    //OR  Load the JDBC Driver
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Create the object of connection
		 //Attempts to establish a connection to the given database URL.
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","System");
		System.out.println("Connect to Oracle Database successfully");
		//We need to create the object of statement interface
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("SELECT * FROM TEST");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		
		con.close();
		stmt.close();
		rs.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}

/*
INTO TEST (ID, NAME) VALUES (2,'Ganesh')
INTO TEST (ID, NAME) VALUES (3,'Vishal')
INTO TEST (ID, NAME) VALUES (4,'Omkar')
INTO TEST (ID, NAME) VALUES (5,'Swapnil')
SELECT * FROM TEST;

*/
