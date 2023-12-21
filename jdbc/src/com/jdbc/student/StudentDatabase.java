package com.jdbc.student;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentDatabase {
	
	private static Connection connection = null;

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dbURL="jdbc:mysql://localhost:3307/jdbcdb";
		String username="root";
		String password="root";
		connection =DriverManager.getConnection(dbURL,username,password);
		
		}
		catch(Exception e) {
			throw new RuntimeException(" Something went wrong");
		}

	}

}
