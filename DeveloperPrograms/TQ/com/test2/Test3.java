package com.test2;

public class Test3 {

public static void main(String[] args) {
	AB ab= new AB();
	ab.showvar();
	
}
}
class AB{
	 int rollNo;
	 String name;
	public static void showvar() {
		System.out.println("roll no="+rollNo +"name="+name);
	}
}
// if we access non static variable to static method this shows an error
