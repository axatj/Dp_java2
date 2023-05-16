//which is not starting to 0 but between zero is present

package com.Encapsulation;
import java.util.Scanner;
public class DuckNumber {

public static void main(String[] args) {
	int n,r,num;

	Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
n=sc.nextInt();
int cnt=0;
boolean flag=false;
num=n;
while(num>0)
{
r=num%10;
if(r==0)
{
	cnt++;
flag=true;	
}
num=num/10;
}
if(cnt>=2)
{
	System.out.println("Duck number:");
}
else {
	System.out.println("not a duck number:");
}
}
}


		 

	


