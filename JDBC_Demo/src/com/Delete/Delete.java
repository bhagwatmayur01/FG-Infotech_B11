package com.Delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {


		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","System");
			Statement stmt=con.createStatement();
			String deleteQuery="Delete from TEST where ID=1";
			int i= stmt.executeUpdate(deleteQuery);
			System.out.println(i+"row(s) deleted successfully");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
