package com.Delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatementInterface {

	public static void main(String[] args) {


		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","System");
			
			String deleteQuery="Delete From Test Where ID=?";
			
			PreparedStatement stmt=con.prepareStatement(deleteQuery);
			stmt.setInt(1, 1);
			
			int i=stmt.executeUpdate();
			System.out.println(i+" Row(s) deleted successfully");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
