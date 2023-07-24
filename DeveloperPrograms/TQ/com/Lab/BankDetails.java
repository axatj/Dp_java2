package com.Lab;
import java.util.Scanner;
public class BankDetails {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int balance=1000;
	int pin=1234;
	int totalAmount;
	char ch;
	System.out.println("Enter upin:");
	int upin=sc.nextInt();
	int flag=0;	
	int i=1;
		 while(i<=3)
		{
			 if(upin==pin)
				{
			flag=1;
			break;
			}
			 else
			 {
				 System.out.println("Invalid pin please try again");
					
			 }
			System.out.println("Enter upin:");
			 upin=sc.nextInt();
			
			i++;
		}
		
		 
	if(flag==1)
	{
	
 	do
	{
		 
	System.out.println("Enter your Name:");
	String name=sc.next();
	
	System.out.println("1.Depoist\n2.Withdraw\n.3.Check\n.4 exit");
	System.out.println("Enter your Choice:");
	int choice;
	choice=sc.nextInt();
	switch(choice)
	{
	case 1:System.out.println("Enter Depoist AMount:");
	int depoist=sc.nextInt();
	depoist=depoist+balance;
	System.out.println(depoist);
	break;
	case 2:System.out.println("Enter withdraw amount:");
	int withdraw=sc.nextInt();
	 totalAmount=balance-withdraw;
	System.out.println("Total Amount remaning="+totalAmount);
	break;
	case 3:System.out.println("Enter Check Balance:");
	int checkBalance=sc.nextInt();
		
	System.out.println("total Balance:="+balance);
	break;
	case 4:System.exit(0);
	break;
	default:System.out.println("Invalid choice:");
	
	
	}
	System.out.println("DO you want to continue:");
	ch=sc.next().charAt(0);
	
	}while(ch=='y'|| ch=='Y');

	}


else
{
	System.out.println("You have Succeed more than 3 attempts");
	}
}}