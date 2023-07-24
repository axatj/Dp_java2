package com.array;

import java.util.*;

public class EndindZeros {

	public static void main(String[] args) {
		int arr[] = { 10, 0, 3, 5, 0, 21, 0, 22 };
		int arr1[] = new int[8];
		int j = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] != 0)
			{
				arr1[j] = arr[i];
				// System.out.print(arr1[j]+",");
				j++;
			}
		}
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == 0)
			{
				arr1[j] = arr[i];
				// System.out.print(arr1[j]+",");
				j++;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}
