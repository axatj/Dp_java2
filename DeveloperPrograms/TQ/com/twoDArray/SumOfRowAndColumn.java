package com.twoDArray;

import java.util.Scanner;

public class SumOfRowAndColumn {

public void Sum_ofRow(int a[][])
{
	for(int i=0;i<a.length;i++)
	{
		int sum=0;
		for(int j=0;j<a[i].length;j++)
		{
			sum=sum+a[i][j];
			System.out.println(a[i][j]+ " ");
		}
		System.out.print("Sum= "+sum);
	    System.out.println();
	}
		
}
	public static void main(String[] args) {
    int a[][]= {{1,2,3},
    		{4,5,6},
    		{7,8,9}};
    
    SumOfRowAndColumn sr=new SumOfRowAndColumn();
    sr.Sum_ofRow(a);
    
    }
	

}
