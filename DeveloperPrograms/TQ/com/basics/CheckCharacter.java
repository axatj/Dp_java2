package com.basics;
import java.util.Scanner;
public class CheckCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char ch;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character :");
        ch=sc.next().charAt(0);
        //to read only one character if you read full string
        //you must include ch=sc.nextLine();
        //this is an example of ladder if
      if((ch>='a' && ch<='z') ||(ch>='A' &&ch<='Z'))
    		  {
    	  System.out.println(ch+ "is a Alphabet");
    		  }
      else if(ch>='0' && ch<='9') {
    	  System.out.println(ch+ "is a Digit");
      }
      else {
    	  System.out.println(ch+"is a special symbol");
      }
	}

}
