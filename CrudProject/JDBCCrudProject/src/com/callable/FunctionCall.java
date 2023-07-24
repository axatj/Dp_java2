package com.callable;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class FunctionCall {
	static Connection conn = null;
	Statement st;
	ResultSet rs;
	CallableStatement cst;

	static Scanner sc = new Scanner(System.in);

	public FunctionCall() {
		conn = DBConnection.getconn();
		try {
			st = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void functionAvgSalary() {
		System.out.println("Enter department name:");
		String dept = sc.next();
		try {

			cst = conn.prepareCall("{?=call  calAvgSalaryDeptName(?)}");
			cst.setString(2, dept);
			cst.registerOutParameter(1, Types.INTEGER);
			boolean status = cst.execute();
			if (!status) {
				System.out.println("The Average salary of department " + dept + "is:" + cst.getInt(1));

			} else {
				System.out.println("Error");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		FunctionCall fc = new FunctionCall();
		fc.functionAvgSalary();
	}
}
