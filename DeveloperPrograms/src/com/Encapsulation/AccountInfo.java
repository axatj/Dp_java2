package com.Encapsulation;
import java.util.Scanner;
public class AccountInfo {

	public static void main(String[] args) {
	BankAccount am=new BankAccount();
	Scanner sc=new Scanner(System.in);
	int ano=sc.nextInt();
	String atype=sc.next();
	int abalance=sc.nextInt();
	am.setAccno(ano);
	am.setAcctype(atype);
	if(abalance>=5000)
	{
		am.setBalance(abalance);
	}
	else
		{
		if(am.getBalance()>=5000)
		{
		System.out.println(am.getAcctype()+" "+am.getAccno()+" "+am.getBalance());
		}
		}
		
	
	}

}
