package com.Lab;
import java.util.*;
public class FindUnique {

	public static void main(String[] args) {
    ArrayList<String>al=new ArrayList<String>();
	al.add("sun");
	al.add("mon");
	al.add("sun");
	al.add("tue");
	al.add("wed");
	al.add("mon");
	System.out.println(al);
	ArrayList<String>al2=new ArrayList<String>();
	for(int i=0;i<al.size();i++)
	{
		for(int j=0;j<al.size();j++)
		{
			if(al.get(i).equalsIgnoreCase(al.get(j)))
			{
				al.remove(i);
			 
			
			}
		}
	}
	
	System.out.println(al);
	
	}

}
