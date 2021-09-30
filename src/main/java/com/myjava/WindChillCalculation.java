package com.myjava;

import java.util.Scanner;

public class WindChillCalculation {

	public static float userInput() {
		Scanner userInputObj = new Scanner(System.in);
		float inputValue = userInputObj.nextFloat();
		return inputValue;
	}

	static double windSpeedCalculation() {
		double windSpeed;
		final double THIRTY_FIVE_POINT_SEVEN = 35.74;
		final double ZERO_POINT_SIX = 0.6215;
		final double ZERO_POINT_FOUR = 0.4275;
		System.out.println("enter the value of t");
		double t = userInput();
		System.out.println("enter the value of v");
		double v = userInput();

		if (t > 50 || v > 120 || v < 3) {
			System.out.println("formmula is not valid for this input");
			return 0;
		} else {
			windSpeed = THIRTY_FIVE_POINT_SEVEN + ZERO_POINT_SIX * t + (ZERO_POINT_FOUR * t - THIRTY_FIVE_POINT_SEVEN) * Math.pow(v, 0.16);
			return windSpeed;
		}
	}

	public static void main(String[] args) {
		System.out.println("Calculating wind speed enter T and V value");
		double windSpeed = windSpeedCalculation();
		System.out.println("the wind speed is " + windSpeed);
	}
	
}
