package com.Lab;
import java.util.*;
public class RemoveDuplicate {

	void remove_dupli(ArrayList<String> colors)
	{
		for(int i=0;i<colors.size();i++)
		{
			for(int j=i+1;i<colors.size();j++)
			{
				if(colors.get(i).equals(colors.get(j)))
				{
			       colors.remove(j);
				}
			}
		}
	System.out.println(colors);	 
	}
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<String>al=new ArrayList<>();
    System.out.println("Enter array elements");
    for(int i=0;i<al.size();i++)
    {
    al.add(sc.next());	
    }
    RemoveDuplicate rd=new RemoveDuplicate();
    rd.remove_dupli(al);
    

	}

}
