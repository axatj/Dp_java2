//write code to create menu program to calculate the area for 
//circle,rectangle,square,triangle.
//circle=3.14*r*r,rectangle=length*breadth,square=r*r,triangle=1/2*breadth*height
package com.loops;
import java.util.Scanner;
public class MenuDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		do {
		System.out.println("1.Area of circle\n 2.Area of Rectangle\n3.Area of square\n4.Area of triangle");
		System.out.println("Enter your choice:");
		int choice;
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter the radius:");
		float r=sc.nextFloat();
		float ac=(22*r*r)/7;
		System.out.println("Area of Circel:"+ac);
		break;
		case 2:System.out.println("Enter length:");
		int l=sc.nextInt();
		int b=sc.nextInt();
        int ar=l*b;
        System.out.println("Area of reactangle:"+ar);
        break;
		case 3:System.out.println("Enter side:");
		int s=sc.nextInt();
		int as=s*s;
		System.out.println("Area of square:"+as);
		break;
		case 4:System.out.println("Enter base:");
		int ba=sc.nextInt();
		System.out.println("Enter height:");
		int h=sc.nextInt();
	    int at=(ba*h)/2;
	    System.out.println("Area of Triangle:"+at);
	    break;
        default:System.out.println("Invalid choice");
		}
		System.out.println("Do you want to continue:");
		ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
 	}
}
