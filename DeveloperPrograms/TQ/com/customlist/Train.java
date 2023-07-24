package com.customlist;

public class Train {
int t_id;
String t_name;
int NoOfSeats;
public Train(int t_id,String t_name,int NoOfSeats)
{
this.t_id=t_id;
this.t_name=t_name;
this.NoOfSeats=NoOfSeats;
}
public String toString()
{
return t_id+" "+t_name+" "+NoOfSeats;
}

	public static void main(String[] args) {
	 
	}

}
