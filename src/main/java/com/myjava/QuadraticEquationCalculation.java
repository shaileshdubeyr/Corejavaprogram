package com.myjava;

import java.util.Scanner;

public class QuadraticEquationCalculation {

	public static int userInput() {
		Scanner userInputObj = new Scanner(System.in);
		int inputValue = userInputObj.nextInt();
		return inputValue;
	}

	static double deltaCalculation(int a, int b, int c) {
		final int CONSTANT_FOUR = 4;
		double delta = (b * b) - (CONSTANT_FOUR * a * c);
		return delta;
	}

	static double equationCalculationFirst() {
		final int CONSTANT_TWO = 2;
		System.out.println("enter the value of a to calculate root");
		int a = userInput();
		System.out.println("enter the value of b to calculate root");
		int b = userInput();
		System.out.println("enter the value of c to calculate root");
		int c = userInput();
		double delta = deltaCalculation(a, b, c);
		double root = (-b + Math.sqrt(delta)) / CONSTANT_TWO * a;
		return root;
	}

	static double equationCalculationSecond() {
		final int CONSTANT_TWO = 2;
		System.out.println("enter the value of a to calculate root");
		int a = userInput();
		System.out.println("enter the value of b to calculate root");
		int b = userInput();
		System.out.println("enter the value of c to calculate root");
		int c = userInput();
		double delta = deltaCalculation(a, b, c);
		double root = (-b - Math.sqrt(delta)) / CONSTANT_TWO * a;
		return root;
	}

	public static void main(String[] args) {
		System.out.println("the equation is a*x*x + b*x + c");
		System.out.println("Due to X*X we have to calculate 2 roots");
		System.out.println("calculating first root");
		double rootfirst = equationCalculationFirst();
		System.out.println("the first root value is " + rootfirst);
		System.out.println("calculating second root");
		double rootSecond = equationCalculationSecond();
		System.out.println("the second root value is " + rootSecond);
	}
}
