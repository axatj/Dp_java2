package com.resultset1types;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ResultSetCrud {
	static Connection conn = null;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;

	static Scanner sc = new Scanner(System.in);

	public ResultSetCrud() {
		conn = DBConnection.getconn();
		try {
			st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("Select * from purchase");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

//	public ResultSetCrud() {
//		conn = DBConnection.getconn();
//		try {
//			st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			rs = st.executeQuery("Select * from model");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public void fetchData1() {
//		try {
//			rs.beforeFirst();
//			{
//				System.out.println("Model details");
//				System.out.println("ModelId   |    ModelName   |   Cost");
//				while (rs.next()) {
//					System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
//				}
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//	}

//	public void fetchData2() {
//		try {
//			rs.beforeFirst();
//			{
//				System.out.println("Customer Details");
//				System.out.println("CustomerId   |    firstName   |   LastName    |     mobileNo   |    Gender   |    Email");
//				while (rs.next()) {
//					System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)+"  "+rs.getString(4)+" "+rs.getString(5)+"  "+rs.getString(6));
//				}
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//	}
//
//	public void insertDetails2()
//	{
//		try
//		{
//			rs.moveToInsertRow();
//			System.out.println("Enter Customer id");
//			int cust_id=sc.nextInt();
//			
//		}
//		
//	}
//	public void insertDetails1() {
//		try {
//			rs.moveToInsertRow();
//			System.out.println("Enter model id");
//			int m_id = sc.nextInt();
//			System.out.println("Enter model name");
//			String m_name = sc.next();
//			System.out.println("Enter cost");
//			int cost = sc.nextInt();
//
//			rs.updateInt(1, m_id);
//			rs.updateString(2, m_name);
//			rs.updateInt(3, cost);
//
//			rs.insertRow();
//			fetchData1();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//	}

	public void fetchData() {

		try {
			rs.beforeFirst();
			System.out.println("Purchase details");
			System.out.println(
					"PurchaseId |  customerId  |  ModelId  |   paymentId  |     RatingId    |     BookingAmount    |   PurchaseDate ");

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "          " + rs.getInt(2) + "           " + rs.getInt(3) + "            " + rs.getInt(4) + "         "
						+ rs.getInt(5) + "         " + rs.getInt(6) + "     " + rs.getString(7));

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void insertDetails() {
		try {
			rs.moveToInsertRow();
			System.out.println("Enter purchase id");
			int purchase_id = sc.nextInt();
			System.out.println("Enter customer id");
			int cust_id = sc.nextInt();
			System.out.println("Enter model id");
			int m_id = sc.nextInt();
			System.out.println("Enter payment id ");
			int pa_id = sc.nextInt();
			System.out.println("Enter rating id");
			int r_id = sc.nextInt();
			System.out.println("Enter booking amount");
			int book_amount = sc.nextInt();
			System.out.println( );
            System.out.println("Enter purchase date");
            String date=sc.next();
            
			rs.updateInt(1, purchase_id);
			rs.updateInt(2, cust_id);
			rs.updateInt(3, m_id);
			rs.updateInt(4, pa_id);
			rs.updateInt(5, r_id);
			rs.updateInt(6, book_amount);
			rs.updateString(7, date);
			rs.insertRow();
			
			fetchData();
		} catch (Exception e) {
			System.out.println(e);

		}

	}

	public static void main(String[] args) {
		ResultSetCrud rst = new ResultSetCrud();
	 rst.fetchData();
 rst.insertDetails();
//		rst.fetchData1();
	//	rst.insertDetails1();
	}

}
