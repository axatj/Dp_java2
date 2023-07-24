package com.array;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		String s1 = "aasjdyrsamkjy";
		String s2 = "mery";
		char ch=' ';
		int x=0;
		char arr[]=new char[20];
		int j = 0;
		for (int i = 0; i < s1.length(); i++) {
			int c = 0;
			for (j = 0; j < s2.length(); j++) {
				if (s1.charAt(i) == s2.charAt(j)) {
					c ++;
					ch = s1.charAt(i);
					s1 = s1.replace(s1.charAt(i), ' ');
					// System.out.println(s1);
					break;

				}
			}
			if (c == 1) {
				//System.out.println(ch);
				arr[x]=ch;
				x++;
     
		        }
			}
		for(int i=0;i<=x;i++)
		{
		for( j=i+1;j<=x;j++)
		{
			if(arr[i]>arr[j])
			{
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	     
		System.out.print(arr[i]);
		
		}
		
	}

	private static void remove(char c) {
		// TODO Auto-generated method stub
		
	}
}
