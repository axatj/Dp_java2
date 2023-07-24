package com.array;

import java.util.Scanner;

public class StringPali {

	public static void main(String[] args) {

// output - avaj od ot ekil I
		// Scanner sc=new Scanner(System.in);
//        
//		String str ="I like to do java";
//
//		String rev = "";
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);
//=============================================================
// output- I ekil ot od avaj- position rev
//        String str="I like to do java";
//        String st[]=str.split(" ");
//        String rev=" ";
//        String space=" ";
//        for(int i=0;i<st.length;i++)
//        {
//        	for(int j=st[i].length()-1;j>=0;j--)
//        	{
//        		rev=rev+st[i].charAt(j);
//        	}
//        rev=rev+space;
//        }
//       System.out.println(rev);
//====================================================
//check pallindrome but first check reverse or not
//      Scanner sc=new Scanner(System.in);
//      String s=sc.nextLine();
//      String rev="";
//      for(int i=s.length()-1;i>=0;i--)
//      {
//    	  rev=rev+s.charAt(i);
//      }
//       System.out.println(rev);
//		if (rev.equals(s)) {
//			System.out.println("palindrome");
//		} else {
//			System.out.println("not");
//		}
//output I ekil ot od java
		String str="I like to do java";
		String st[]=str.split(" ");
		String rev="";
		String space=" ";
		for(int i=0;i<st.length;i++)
		{
			if(st[i]==st[0] || st[i]==st[st.length-1])
			{
			for(int j=0;j<st[i].length();j++)
			{
				rev=rev+st[i].charAt(j);
			}
		}
			else {
				for(int k=st[i].length()-1;k>=0;k--)
				{
					rev=rev+st[i].charAt(k);
				}
			}
			rev=rev+space;
			
			}
		System.out.println(rev);
	}

}
