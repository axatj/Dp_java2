package com.practice;

public class PrimeNumber {
	public static void main(String[] args) {
    int num=89734;
    int count=0;
    while(num>0)
    {
    	int digit=num%10;
    	for(int i=2;i<digit;i++)
    	{
    		if(digit%i==0)
    		{
    			count++;
    		
    	}
    }
    if(count==0)
    	{
    		System.out.println(digit+"Prime number");
    	}
    	 num=num/10;
    }
	
		// TODO Auto-generated method stub

	}}


