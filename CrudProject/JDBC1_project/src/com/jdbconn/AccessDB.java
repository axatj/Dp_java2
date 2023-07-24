package com.jdbconn;

import java.sql.Connection;

public class AccessDB {
	public static Connection conn=null;
	public AccessDB()
	{
		conn=DBConnection.getConnection();
		System.out.println("Connection Established-------");
	}

	public static void main(String[] args) {
	 AccessDB obj=new AccessDB();

	}

}
