package com.string;

public class Alternate {

	public static void main(String[] args) {
   int arr1[]= {2,4,6,8,10};
   int arr2[]= {1,3,5,7,9};
   int j=0;
   int k=1;
   int merge[]=new int[10];
    for(int i=0;i<arr1.length;i++)
    {
         
    if(j<10 && k<10)
    	{merge[j]=arr1[i];
        merge[k]=arr2[i];
    j=j+2;
    k=k+2;
    	}  
    }
    for(int i=0;i<9;i++)
    {
    	System.out.println(merge[i]);
    }

	}

}
