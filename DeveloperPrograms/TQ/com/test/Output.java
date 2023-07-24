package com.test;
 
class test{
int a;
int b;
test(int a,int b)
{
a=a;
b=b;
}
public void meth(int i,int j)
{
i*=2;
System.out.println(i);//extra line
j/=2;
System.out.println(j);//extra line

}

}
public class Output {

	public static void main(String[] args) {
//		 test t=new test();//parameter constructor call but argument not pass 
	test t=new test(2,3);
		t.a=10;
		 t.b=20;
        		
 		 t.meth(t.a,t.b);
	} 
}
