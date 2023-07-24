package com.inheritance;

class table
{
 int legs=4;
String color="yellow";
String body_type="rectangle";


}
class chair extends table
{
	void showDetails()
	{
    System.out.println(legs+" "+color+" "+body_type);       	
    }
}


public class Single_Inheritance2 {

	

	
	
	public static void main(String[] args) {
         chair c=new chair();
         c.showDetails();
         

	}

}
