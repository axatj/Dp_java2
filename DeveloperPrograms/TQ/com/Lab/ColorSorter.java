package com.Lab;

import java.util.Arrays;

public class ColorSorter {

	public void Color_Sorter(String[] str) {
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].charAt(0) < str[j].charAt(0)) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}

			}

		}

		System.out.println(Arrays.toString(str));
	}

	public static void main(String[] args) {
		String arr[] = { "red", "yellow", "green", "blue", "brown" };
		ColorSorter cs = new ColorSorter();
		cs.Color_Sorter(arr);
		// String[] cor=new String[arr.length];
		// for(int i=0;i<arr.length;i++)
		// {
		// for(int j=i+1;j<arr.length;j++)
		// {
		// if(arr[i].compareTo(arr[j])<0)
		// {
		// String temp=arr[i];
		// arr[i]=arr[j];
		// arr[j]=temp;

		// }
		// }
		// }
		System.out.println(Arrays.toString(arr));
	}

}
