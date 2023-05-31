package com.array;

import java.util.Arrays;

public class ArraySort {
public void sortElement(int a[]){
	System.out.println(Arrays.toString(a));
	for(int i=0;i<a.length;i++)
	{
		for(int j=1+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
}
	public static void main(String[] args) {
	int a[]= {6,2,9,2,5};
	ArraySort as=new ArraySort();
	as.sortElement(a);
     
	}

}
