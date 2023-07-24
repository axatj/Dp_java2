package com.lambdademo;

public class Withlambda {

	public static void main(String[] args) {
		Movable Truck = () -> {
			System.out.println("Truck is moving with speed of 50km/hr");
		};
		Truck.move();
	}

}
