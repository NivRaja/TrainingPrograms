package databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class data {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		  Class.forName("com.mysql.cj.jdbc.Driver");
  	    Connection  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/securitysystem"+ "","root","suvniv");
  	    if (connection != null) {
              System.out.println("Connected to the database!");
              
          }
  	    else
  	    {
  	    	System.out.println("Database connection broken");
  	    	System.exit(0);
  	    }
  	   

	}
}
