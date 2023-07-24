package com.resultsetTypes;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/bankinfo";
	public static final String USER="root";
	public static final String PASS="4899226";
	
	
	static Connection conn=null;
	public static Connection getconn()
	{
	    try
		{
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver loaded------");
			conn=DriverManager.getConnection(JDBC_URL, USER, PASS);
		    System.out.println("Connection  established-------");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return conn;
	} 
}
