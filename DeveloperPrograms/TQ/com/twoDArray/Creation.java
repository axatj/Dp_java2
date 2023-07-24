package com.twoDArray;
import java.util.Arrays;
import java.util.Scanner;
public class Creation {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr[][]=new int [3][2];
		arr[0][0]=5;
		arr[0][1]=2;
		arr[1][0]=7;
		arr[1][1]=8;
		arr[2][0]=1;
		arr[2][1]=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array element");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
System.out.println("-----------");
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length;j++)
		{
		System.out.println(arr[i][j]+" ");
		
		}
	}
	}

}
 