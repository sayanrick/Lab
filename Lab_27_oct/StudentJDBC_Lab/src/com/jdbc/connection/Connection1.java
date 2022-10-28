package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection1{
	static {
		try {
			//register driver
			Class.forName("com.mysql.cj.jdbc.Driver"); 
		}
		catch(Exception e) {
			System.out.println(e);
		}	
	}
	public static Connection con() throws SQLException{
		return    DriverManager.getConnection( "jdbc:mysql://localhost:3306/lab","root","Owashim@1");//creating connection
		 
	}
}