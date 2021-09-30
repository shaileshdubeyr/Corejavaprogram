package com.myjava;

public class LineDistanceCalculation {

	public static void main(String[] args) {
		int xCordinateInput = Integer.parseInt(args[0]);
		int yCordinateInput = Integer.parseInt(args[1]);
		double distanceOfLine = Math.sqrt(xCordinateInput * xCordinateInput + yCordinateInput * yCordinateInput);
		System.out.println("the distance is " + distanceOfLine);
	}
}
