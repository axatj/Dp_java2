package com.Lab;

public class Bank {
public String b_name="sbi";
private int locker_id=1234;
protected float rateofinterest=20;
String branch_name="Binaganj";
public String getb_name()
{
	return b_name;
	
}
private int getlocker_id()
{
return locker_id;
}
protected float getrateofinterest() {
	return rateofinterest;
}
String getbranch_name() {
	return branch_name;
}

	public static void main(String[] args) {
   Bank b=new Bank();
   System.out.println(b.getb_name());
   System.out.println(b.getlocker_id());
   System.out.println(b.getrateofinterest());
   System.out.println(b.getbranch_name());
  
   
   

	}

}
