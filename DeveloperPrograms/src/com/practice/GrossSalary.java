//calculate gross salary 
//gross salary=daily allowance+basic salary+house rent allowance

package com.practice;
import java.util.Scanner;
public class GrossSalary {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter basic Salary");
    float bs1=sc.nextFloat();
    float da1,hra1,gs1,da2,hra2,gs2,da3,hra3,gs3;
    if(bs1<=10000)
    {
    	da1=20*bs1/100;
    	hra1=80*bs1/100;
    	gs1=da1+hra1+bs1;
    	System.out.println("Gross Salary 1:"+gs1);
    }
    else if(bs1<=20000)
    {
    	da2=90*bs1/100;
    	hra2=25*bs1/100;
    	gs2=da2+hra2+bs1;
    	System.out.println("Gross Salary 2:"+gs2);
    }
    else if(bs1>20000)
    {
    	da3=95*bs1/100;
    	hra3=30*bs1/100;
    	gs3=da3+hra3+bs1;
    	System.out.println("Gross Salary 3:"+gs3);
    }
    else
    {
    	System.out.println("Invalid output");
    }
	}

}
