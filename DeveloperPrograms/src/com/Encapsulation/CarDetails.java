package com.Encapsulation;
import java.util.Scanner;
public class CarDetails {

	public static void main(String[] args) {
    car c=new car();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter model number:");
    int cmodelNumber=sc.nextInt();
    System.out.println("Enter car name:");
    String ccarName=sc.next();
    System.out.println("Enter speed limit:");
    int cspeedLimit=sc.nextInt();
    c.setModelNumber(cmodelNumber);
    c.setCarName(ccarName);
    c.setSpeedLimit(cspeedLimit);
    System.out.println(c.getModelNumber()+" "+c.getCarName()+" "+c.getSpeedLimit());
	}

}
