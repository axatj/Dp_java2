package com.array;
//0,1,1,2,3,5,8,13,21,34,55,89
public class Fibo {

	public static void main(String[] args) {
	int num1=0,num2=1,num3;
	System.out.print(num1+" ");
	System.out.print(num2 +" ");
    for(int i=0;i<=10;i++)
    {
    	num3=num1+num2;
    	num1=num2;
    	num2=num3;
    	System.out.print(num3 +" ");
    }
	} 
}
