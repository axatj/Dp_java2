package com.Lab;
import java.util.Scanner;
public class StartingCaptical {

public void Starting_Captical(String str2)
{
String s="";	
String st[]=str2.split(" ");
for(int i=0;i<st.length;i++)
{
char[] wordstr=st[i].toCharArray();	

for(int j=0;j<wordstr.length;j++)
{
if(j==0)
{
wordstr[j]=(char)(wordstr[j]-32);
System.out.print(wordstr[j]);	
}

else {
	wordstr[j]=wordstr[j];
	System.out.print(wordstr[j]);
}
}
System.out.println();
}

}
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
    String s=sc.nextLine();
    StartingCaptical st=new StartingCaptical();
    st.Starting_Captical(s);
     
    
    		

	}

}
