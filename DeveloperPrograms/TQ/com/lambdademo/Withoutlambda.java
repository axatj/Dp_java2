package com.lambdademo;

interface Movable {
	public void move();

	default void changeSpeed() {
		System.out.println("Speed Increased");
	}

}

public class Withoutlambda {

	public static void main(String[] args) {
		Movable ball = new Movable() {
            //anonymous inner class
			@Override
			public void move() {
				System.out.println("Ball is rolling at the speed of 10km/hr");

			}

		};

		ball.move();
		Movable car = new Movable() {

			@Override
			public void move() {
				System.out.println("car is moving at the speed of 60km/hr");

			}

		};

		car.move();

	}
}
