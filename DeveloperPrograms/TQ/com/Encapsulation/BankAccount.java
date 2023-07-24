package com.Encapsulation;

public class BankAccount {
private int accno;
private String acctype;
private int balance;

public void setAccno(int accno)
{
this.accno=accno;
}
public void setAcctype(String acctype)
{
this.acctype=acctype;	
}
public void setBalance(int balance)
{
if(balance<5000)
{
System.out.println("Insufficient balance:");	
}
else
{
	this.balance=balance;
	}

}
public int getAccno() {
	return accno;
}
public String getAcctype() {
	return acctype;
}
public int getBalance() {
	return balance;
}
}
