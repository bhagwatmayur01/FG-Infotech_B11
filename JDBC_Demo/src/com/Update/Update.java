package com.Update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con=	DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","System");
		    Statement stmt= con.createStatement();
		    String updateQuery = "UPDATE TEST SET NAME='Sameer' Where ID=1";
		    int i= stmt.executeUpdate(updateQuery);
		    System.out.println(i+" Row(s) updated successfully.!");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
