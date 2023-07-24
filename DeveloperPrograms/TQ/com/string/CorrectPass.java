package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class CorrectPass {
	public int uc_count(String p) {
		int uc_count = 0;
		for (int i = 0; i < p.length(); i++) {
			if (p.charAt(i) >= 'A' && p.charAt(i) <= 'Z') {
				uc_count++;
			}
			return uc_count;
		}
	}

	public String last3char(String s) {
		String last3char = "";
		for (int j = s.length() - 1; j > s.length() - 4; j++) {
		}
	}

	}

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a new String");
   String s=sc.next();
   String hint[]= {"4dro6","1dro0","1%$#1","6pass7"};
   String pass[][]= {{"P@sswORD1","20passWORD20","PASS6word"},
		   {"theBestpassword","myPassword#3"},
		   {"MyPassword2","crazyPassword1#$%"},
		   {"luckyPASSWORD$$$","luckyDay666"}};
   CorrectPass cp=new CorrectPass();
   for(int i=0;i<pass.length;i++)
   {
	   cp.CorrectPass(pass[i],hint[i]);
   }
	}
	}
