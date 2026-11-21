package com.callabletatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class FCallablestmt {

	public static void main(String[] args) {
		
		try {
		 Class.forName("oracle.jdbc.driver.OracleDriver");
	     Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","System");
	       

	     //ctrate a callableStatement interface
	     CallableStatement cstmt=con.prepareCall("{?=call GET_EMP_NAME(?)}");
	     
	     //Register (OUT) parameter
	     cstmt.registerOutParameter(1, Types.VARCHAR);
	     
	     //set input parameter
	     cstmt.setInt(2, 4);  //EMP_ID
	     
	     //execute the exceute method for execution
	     cstmt.execute();
	     
	     //get the result
	     String empName=cstmt.getString(1);
	     System.out.println(empName);
	        
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	}


