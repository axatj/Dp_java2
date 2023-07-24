package com.lambdademo;

 
interface Substraction {
	int sub(int n1, int n2);
}

public class LambdaMultiPara2 {

	public static void main(String[] args) {
		Substraction a1 = (n1, n2) -> {
			System.out.println("First number" + n1);
			System.out.println("Second number" + n2);
			 return(n1 -n2);

		};
		System.out.println("The ans is "+a1.sub(45, 32));
		
		System.out.println("-----------");

		// body can be omitted
		Substraction a2 = (int n1, int n2) -> (n1 -n2);
		System.out.println("The ans is"+a2.sub(40, 30));
		
	
	}

}



