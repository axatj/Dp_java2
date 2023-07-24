package com.array;

public class Test3 {

	public static void main(String[] args) {
	for(int i=1;i<=20;i++)
	{
		if(i%3==0 && i%5==0)
		{
			System.out.println("OnexTel");
			
		}
		else if(i%3==0)
		{
			System.out.println("Onex");
		}
		else if(i%5==0)
		{
        System.out.println("Tel"); 
		}
		else
		{
			System.out.println(i);
		}
		}
	}

}
