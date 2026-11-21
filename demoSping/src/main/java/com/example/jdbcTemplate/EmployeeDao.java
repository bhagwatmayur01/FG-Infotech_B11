package com.example.jdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {

	private JdbcTemplate JdbcTemplate;

	/*
	public JdbcTemplate getJbcTemplate() {
		return jbcTemplate;
	}
    */
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.JdbcTemplate = jdbcTemplate;
	}
	
	public int saveEmployee(Employee e) {
		String query="INSERT INTO employee23 (id, name, salary) Values(?,?,?)";
		return JdbcTemplate.update(query, e.getId(), e.getName(), e.getSalary());
	}
	
	public int updateEmployee(Employee e) {
		String query = "UPDATE employee23 SET name =?, salary=?, Where id=?";
		return JdbcTemplate.update(query,  e.getName(), e.getSalary(), e.getId());
	}
	
	public int deleteEmployee(Employee e) {
		String query = "DELETE From employee23 Where id = ? ";
		return JdbcTemplate.update(query, e.getId());
	}
	
	//Get All Employees
	
	
	
}
