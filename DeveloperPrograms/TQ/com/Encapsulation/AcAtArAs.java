package com.Encapsulation;
import java.util.Scanner;
public class AcAtArAs {
Scanner sc=new Scanner(System.in);
	
	public void Ac()
	{
	System.out.println("Enter radius");
int	r=sc.nextInt();
	int ac=(22*r*r)/7;
	System.out.println("Area of circle="+ac);
	}
	public void At()
	{
		System.out.println("Enter length");
	double l=sc.nextDouble();
		System.out.println("Enter breadth");
	double b=sc.nextDouble();
	double at=0.5*l*b;
		System.out.println("Area of triangle="+at);
	}
	public void As()
	{
		System.out.println("Enter side");
		int s=sc.nextInt();
		int as=s*s;
		System.out.println("Area of square="+as);
	}
	public void Ar()
	{
		System.out.println("Enter length");
	int	l=sc.nextInt();
		System.out.println("Enter breadth");
	int	b=sc.nextInt();
	int	ar=l*b;
		System.out.println("Area of rectangle="+ar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcAtArAs a=new AcAtArAs();
		a.Ac();
        a.Ar();
        a.As();
        a.At();
	}

}
