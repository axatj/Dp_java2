package com.loops;

public class Series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.print(i*i*i-1+" ");
			}
			else
			{
				System.out.print(i*i+1+" ");
			}
		}

	}

}
