package com.jdbconn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchBike_ShowroomData {

	static Connection conn=null;
	Statement st;
	ResultSet rs;
	
	public FetchBike_ShowroomData() throws SQLException
	{
		conn=DBConnection.getConnection();
		System.out.println("Connection");
		st=conn.createStatement();
	}
	
	
	public void fetchmodelData()
	{
		try
		{
			rs=st.executeQuery("Select * from model");
			System.out.println("----------Model Details-----");
			System.out.println("ModelId      |      modelName       |      Cost");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"              "+rs.getString(2)+"                   "+rs.getInt(3));
				
			}
			System.out.println("---------");
		}catch(Exception e)
		{
			System.out.println(e);
		}
  	}
	
	public void fetchpurchaseData()
	{
		try
		{
			rs=st.executeQuery("Select * from purchase");
			System.out.println("-----Purchase Details-----");
			System.out.println("purchaseId  |  CustomerId   |    ModelId      |    paymentId    |    ratingId       |      BookingAmount     |    PurchaseDate    ");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"           "+rs.getInt(2)+"             "+rs.getInt(3)+"           "+rs.getInt(4)+"          "+rs.getInt(5)+"           "+rs.getInt(6) +"           "+rs.getString(7));
				
			}
			System.out.println("---------");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	public void fetchcustomerdetailsthroughpurchase(int cust_id)
	{
		try
		{
			rs=st.executeQuery("Select * from purchase where cust_id="+cust_id);
			System.out.println("---------Purchase details-------");
			System.out.println("purchaseId  |   custmeId  |  modelId   |   paymentId   |    ratingId   |    bookingAmount   |     purchaseDate");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+"   "+rs.getInt(2)+"  "+rs.getInt(3)+"  "+rs.getInt(4)+"  "+rs.getInt(5)+" "+rs.getInt(6)+"  "+rs.getString(7)); 
	}
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws SQLException {
		FetchBike_ShowroomData fbsd=new FetchBike_ShowroomData();
		fbsd.fetchmodelData();
		fbsd.fetchpurchaseData();
		int cust_id=202;
		fbsd.fetchcustomerdetailsthroughpurchase(cust_id);
	}

}
