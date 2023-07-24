package com.lambdademo;

interface changeable {
	public int changeSpeed(int speed);

	default void start(String obj) {
		System.out.println(obj + "Started......");

	}

}

public class LambdaWithPara2 {

	public static void main(String[] args) {
		changeable car = (speed) -> {
//			System.out.println("Original speed :"+speed+"km/hr");
//			speed+=20;
//			return speed;

			return (speed + 20);
		};
		car.start("car");
		System.out.println("car has increased speed to" + car.changeSpeed(30) + "km/hr");

		changeable bike = speed -> (speed + 10);
		bike.start("Bike");
		System.out.println("Bike has increased speed to " + bike.changeSpeed(20) + "km/hr");
	}

}
