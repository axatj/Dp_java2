package com.opps;

public class CarExample {
	int ModelNumber;
	String CarName;
	int CarPrice;
	String CarColour;

	public static void main(String[] args) {

		
    Car car1;
	car1=new Car();
	Car car2;
	car2=new Car();
	Car car3;
	car3=new Car();
	car1.ModelNumber=4321;
	car2.ModelNumber=5678;
	car3.ModelNumber=9876;
	car1.CarName="Audi";
	car2.CarName="Thar";
	car3.CarName="BMW";
	car1.CarPrice=4000000;
	car2.CarPrice=5000000;
	car3.CarPrice=6000000;
	car1.CarColour="Black";
	car2.CarColour="Red";
	car3.CarColour="Grey";
	System.out.println(car1.ModelNumber+"\n"+car1.CarName+"\n"+car1.CarPrice+"\n"+car1.CarColour);
	System.out.println(car2.ModelNumber+"\n"+car2.CarName+"\n"+car2.CarPrice+"\n"+car2.CarColour);
	System.out.println(car3.ModelNumber+"\n"+car3.CarName+"\n"+car3.CarPrice+"\n"+car3.CarColour);
	

	}

}
