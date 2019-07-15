package com.cognizant.employeemanagementsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	public final static String URL="jdbc:mysql://localhost:3306/mydb";
	public final static String CLASSNAME="com.mysql.jdbc.Driver";
	public final static String USERNAME="root";
	public final static String PASSWORD="root";
		
	public static Connection getConnection()
	{
		Connection connection=null;
		try {
			Class.forName(CLASSNAME);
			connection=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	public static void closeConnection(Connection connection)
	{
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
