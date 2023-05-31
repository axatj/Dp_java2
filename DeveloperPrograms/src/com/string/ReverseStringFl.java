package com.string;
import java.util.Scanner;
public class ReverseStringFl {
public void reverseString(String str)
{
System.out.println(str);
String st[]=str.split(" ");
String reverse="";
for(int i=1;i<st.length-1;i++)
{
String revword="";
for(int j=st[i].length()-1;j>=0;j--)
{
revword=revword+st[i].charAt(j);
}	
reverse=reverse+revword+" ";
}
System.out.println(reverse);
}
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Srring");
	String s=sc.nextLine();
    ReverseStringFl rs=new ReverseStringFl();
    rs.reverseString(s);

	}

}
