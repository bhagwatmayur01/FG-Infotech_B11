package com.callabletatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class SPUsingCallableStatement {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		try {
       Class.forName("oracle.jdbc.driver.OracleDriver");
       con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","System");
       
       //ctrate a callableStatement interface
       CallableStatement cstmt=con.prepareCall("{call INCREASE_SALARY(?,?,?)}");
       
       //Set the inpute parameter
       cstmt.setInt(1, 1);
       cstmt.setDouble(2, 1000);
       
       //Register out parameter
       cstmt.registerOutParameter(3, Types.DOUBLE);  //New_SALARY
       
       //Execute method for Execution
       cstmt.execute();
       
       //get output
       double newSalary=cstmt.getDouble(3);
       System.out.println("Updated Salary: "+newSalary);
       
       
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			con.close();
		}

	}

}
