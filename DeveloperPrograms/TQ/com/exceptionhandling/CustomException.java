package com.exceptionhandling;

class NegativeIndexException extends Exception{
public NegativeIndexException() {
	System.out.println("-ve number not allowed");
}

public NegativeIndexException(String msg) {
	super(msg);
}
}

public class CustomException {
public static void check(int base,int expo) throws NegativeIndexException{
int power=1;
if(expo<0) {
	throw new NegativeIndexException();
}
else
{
	for(int i=1;i<expo;i++)
	{
		power=power*expo;
	}
	System.out.println(power);
		}
	
}
	public static void main(String[] args) {
    
	try {
		CustomException.check(2, -3);
	}catch(NegativeIndexException e) {
		System.out.println(e.getMessage());
	}
	System.out.println("Done--------");
	}

}
