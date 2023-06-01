package com.string;

import java.util.Scanner;

public class ToggleStringConvert {

public void Toggle_String_Convert(String s)
{
String Toggle="";
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)>='A' && s.charAt(i)<='Z')
{
Toggle=Toggle+(char)((s.charAt(i)+32));
}
else if(s.charAt(i)>='a' && s.charAt(i)<='z')
{
Toggle=Toggle+((char)(s.charAt(i)-32));	
}
}
System.out.println(Toggle);
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String s=sc.nextLine();
    ToggleStringConvert tsc=new ToggleStringConvert();
    tsc.Toggle_String_Convert(s);
   
	}

}
