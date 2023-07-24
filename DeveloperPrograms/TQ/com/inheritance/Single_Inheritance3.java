package com.inheritance;

class cricket
{
String Player_Name="virat kohli";
int score=59;

}
class player extends cricket
{
	void player_details()
	{
System.out.println(Player_Name);
System.out.println(score);
}
}

public class Single_Inheritance3 {

	public static void main(String[] args) {
	
		player p=new player();
		p.player_details();
	}

}
