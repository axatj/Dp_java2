package com.resultsetTypes;

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

			st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from accounts");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void fetchData() {
		try {
			rs.beforeFirst();

			System.out.println("--------Account Data-------");
			System.out.println("----------------------");
			System.out.println("Accno  |  customerId  |   AcctypeId  |   Balance");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "         " + rs.getInt(2) + "           " + rs.getInt(3)
						+ "           " + rs.getInt(4));

			}
			System.out.println("------------");

		} catch (Exception e) {
			System.out.println(e);

		}
	}

	public void insertAccount() {
		try {
			rs.moveToInsertRow();
			System.out.println("Enter the account no");
			int accno = sc.nextInt();
			System.out.println("Enter customer id");
			int cid = sc.nextInt();
			System.out.println("Enter account type id");
			int acctype = sc.nextInt();
			System.out.println("Enter balance");
			long bal = sc.nextLong();

			rs.updateInt(1, accno);
			rs.updateInt(2, cid);
			rs.updateInt(3, acctype);
			rs.updateLong(4, bal);

			rs.insertRow();
			fetchData();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void deleteAccount(int accno) {
		try {
			rs.beforeFirst();
			while (rs.next()) {
				if (rs.getInt(1) == accno)

				{
					rs.deleteRow();
				}
			}
			fetchData();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void updateAccountBalance(int accno) {
		try {
			rs.beforeFirst();
			while (rs.next()) {
				if (rs.getInt(1) == accno) {
					System.out.println("Old balance " + rs.getInt("Balance"));
					System.out.println("Enter new Balance");
					long bal = sc.nextLong();
					rs.updateLong(4, bal);
					rs.updateRow();
				}
			}
			fetchData();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		ResultSetCrud rsc = new ResultSetCrud();
		rsc.fetchData();
		// rsc.insertAccount();
		rsc.deleteAccount(78677);
		// rsc.updateAccountBalance(78678);

	}

}
