package com.TestPaper11;

public class RightShiftMiddleHalfOfArray {
	 public static void shiftArray(int arr[])
	 {
	  if(arr.length%2==0)
	  {
	   for(int i=arr.length/2;i<arr.length;i++)
	   {
	    System.out.print(arr[i]+" ");
	   }
	   for(int j=0;j<arr.length/2;j++)
	   {
	    System.out.print(arr[j]+" "); 
	   }
	  }
	  else
	  {
	   for(int i=(arr.length/2)+1;i<arr.length;i++)
	   {
	    System.out.print(arr[i]+" ");
	   }
	   for(int j=0;j<(arr.length/2)+1 ;j++)
	   {
	    System.out.print(arr[j]+" "); 
	   }
	  }
	 }
	 public static void main(String[] args) {
	  int  arr[]= {1,2,3,8,4,5,6,7,9};
	  shiftArray(arr);
	 }
	  
	}
