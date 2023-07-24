package com.test;

class overload{
	
static int x=2;
int y;
void add(int a)
{
x=a+1;	
}
void add(int a,int b){
    add(a);
	x+=a+2;//x=x+a+2;
}
}

public class Overloads_methods {

	public static void main(String[] args) {
		 overload obj=new overload();
		 int a=0;
 		 obj.add(6,7);
         System.out.println(obj.x);     
	}

}
