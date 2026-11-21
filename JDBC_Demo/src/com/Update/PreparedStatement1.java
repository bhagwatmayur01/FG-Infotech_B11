package com.Update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatement1 {

	public static void main(String[] args) {


		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con=	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","System");
		    
		    String updateQuery = "UPDATE TEST SET NAME=? Where ID=?";
		    PreparedStatement stmt=con.prepareStatement(updateQuery);
		    stmt.setString(1, "Sameer");
		    stmt.setInt(2, 1);
		    int i= stmt.executeUpdate();
		    System.out.println(i+" Row(s) updated successfully.!");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
