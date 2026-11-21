package com.Read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementInterface {

	public static void main(String[] args) {

         try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","System");
		
	    String selectQuery="Select * From Test";
		
		PreparedStatement stmt=con.prepareStatement(selectQuery);
		ResultSet rs=stmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt("Id")+" "+ rs.getString("Name"));			
		}
         }
         catch(Exception e) {
        	 System.out.println(e);
         }

	}

}
