package com.Lab;
import java.util.*;

public class Weekdays {

	public static void main(String[] args) {
	ArrayList<String>Weekdays=new ArrayList<>();
	Weekdays.add("Monday");
	Weekdays.add("Tuesday");
	Weekdays.add("Wednesday");
	Weekdays.add("Thrusday");
	Weekdays.add("Friday");
	Weekdays.add("Saturday");
	Weekdays.add("Sunday");
	for(int i=0;i<Weekdays.size();i++)
	{
		String st=Weekdays.get(i);
		if(st.length()>=7)
		{
			Weekdays.remove(st);
			i--;
		}
	}
	System.out.println(Weekdays);
	}

}
