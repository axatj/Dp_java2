//10101
//01010
//10101
//01010
//10101

package com.basics;

public class Pattern10101010101 {

	public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		int num=0;
		 if(i%2==0)
		{
			 num=0;
			System.out.print(num);
		}
		
		else
		{
			num=1;
			System.out.print(num);
		}
		 for(int j=1;j<5;j++)
		 {
			 if(num==1)
			 {
				 num=0;
			 }
			 else
			 {
				 num=1;
			 }
			 System.out.print(num);
		 }
		 System.out.println();
		}
		
	}}


