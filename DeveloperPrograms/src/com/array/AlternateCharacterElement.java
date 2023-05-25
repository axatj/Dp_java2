package com.array;
import java.util.Arrays;
import java.util.Scanner;
public class AlternateCharacterElement {

	public static void alternateE(char ch[])
	{
System.out.println(Arrays.toString(ch));
for(int i=0;i<ch.length;i++)
{
if(ch[i]>='A' && ch[i]<='Z')
{
ch[i]=(char)(ch[i]+2);
}
else if(ch[i]>='a' && ch[i]<='z')
{
ch[i]=(char)(ch[i]+2);	
}
else
{
ch[i]=ch[i];	
}
}
System.out.println(Arrays.toString(ch));		
	}
	public static void main(String[] args) {
	char ch[]=new char[5];
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the elements of array");
	for(int i=0;i<ch.length;i++)
	{
	ch[i]=sc.next().charAt(0);
	}
	AlternateCharacterElement.alternateE(ch);
	}

}
