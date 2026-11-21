package com.Create;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementInterface {

	public static void main(String[] args) {


		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","System");
		
		String insertQuery="Insert Into Test values(?,?)";
		
		PreparedStatement stmt=con.prepareStatement(insertQuery);
		stmt.setInt(1, 1);
		stmt.setString(2,"Mayur");
		int i=stmt.executeUpdate();
		System.out.println(i+" Row(s) inserted succesfully");
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
