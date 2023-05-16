package com.opps;

public class Car {
	int ModelNumber;
	String CarName;
	int CarPrice;
	String CarColour;

	public static void main(String[] args) {
    Car car1;
    car1=new Car();
    car1.ModelNumber=1234;
    car1.CarName="BMW";
    car1.CarPrice=4000000;
    car1.CarColour="Black";
    System.out.println(car1.ModelNumber+" \n"+car1.CarName+"\n"+car1.CarPrice+"\n"+car1.CarColour);
    

	}

}
