package com.jdbconn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAccountsData {

	static Connection conn=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	public FetchAccountsData() throws SQLException
	{
		conn =DBConnection.getConnection();
		System.out.println("Connection ");
		st=conn.createStatement();
		
	}
	public void fetchData()
	{
		try
		{
			rs=st.executeQuery("Select * from accounts");
			System.out.println("--------Account Data--------");
			System.out.println("----------------------");
			System.out.println("Accno  |  customerId  |   AcctypeId  |   Balance");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"         "+rs.getInt(2)+"           "+rs.getInt(3)+"           "+rs.getInt(4));
		        
			}
			System.out.println("------------");
			
		}catch(Exception e)
		{
			System.out.println(e);
			
	   }
	}
	public void fetchtransactionbyAccno(int accn)  
	{
		try
		{
			rs=st.executeQuery("Select * from transaction where acc_no="+accn);
			System.out.println("------------Transaction details-----------");
			System.out.println("-------------------");
			System.out.println("TransactionId   |     AccNo     |  Amount  |   Transaction_type   |   date   ");
			while(rs.next())
			{
			System.out.println(rs.getInt(1) +"   "+rs.getInt(2)+"   "+rs.getLong(3)+"   "+rs.getString(4)+"   "+rs.getDate(5));
			
			}
			System.out.println("--------");
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void getAccountDetails(int acc_no)
	{
		try
		{
			rs=st.executeQuery("Select * from accounts where acc_no="+acc_no);
			while(rs.next())
			{
				System.out.println("-------------Account Details------------");
				System.out.println("Account no:"+rs.getInt(1));
				System.out.println("Custoemr id:"+rs.getInt(2));
				System.out.println("Account type:"+rs.getInt(3));
				System.out.println("Balance: "+rs.getLong(4));
			}
		}catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	public void getAccountDetails2()
	{
		try
		{
		pst=conn.prepareStatement("Select * from accounts where acc_no=?");
		pst.setInt(1, 23777);
		rs=pst.executeQuery();
		while(rs.next())
		{
			System.out.println("------Account Details-----");
		    System.out.println("Account no:"+rs.getInt(1));
		    System.out.println("Customer id :"+rs.getInt(2));
		    System.out.println("Account type:"+rs.getInt(3));
		    System.out.println("Balance :"+rs.getLong(4));
		}
		
		
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void getAccountDetails3()
	{
		try
		{
			pst=conn.prepareStatement("Select * from accounts where balance >? and acctype_id=?");
			pst.setInt(1,10000);
			pst.setInt(2, 101);
			
			System.out.println("Account details >10000");
			rs=pst.executeQuery();
			while(rs.next())
			{
				System.out.println("------Account Details-----");
			    System.out.println("Account no:"+rs.getInt(1));
			    System.out.println("Customer id :"+rs.getInt(2));
			    System.out.println("Account type:"+rs.getInt(3));
			    System.out.println("Balance :"+rs.getLong(4));
			}
	
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	 
	public static void main(String[] args) throws SQLException {
		 
    FetchAccountsData al=new FetchAccountsData();
    al.fetchData();
    int acc_no=23777;
    al.fetchtransactionbyAccno(acc_no);
    al.getAccountDetails(acc_no);
	al.getAccountDetails2();
	al.getAccountDetails3();
	}

}
