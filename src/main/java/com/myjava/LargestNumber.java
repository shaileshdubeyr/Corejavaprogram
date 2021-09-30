package com.myjava;

import java.util.Scanner;

public class LargestNumber {
	public static void checkLargestNumber() {
		System.out.println("enter first number");
		int firstNumber = userInput();
		System.out.println("enter second number");
		int secondNumber = userInput();
		System.out.println("enter third number");
		int thirdNumber = userInput();
		int largestNumber = compareOperation(firstNumber, secondNumber, thirdNumber);
		System.out.println("the largest number is " + largestNumber);
	}

	public static int userInput() {
		Scanner userInputObj = new Scanner(System.in);
		int inputValue = userInputObj.nextInt();
		return inputValue;
	}

	static int compareOperation(int firstNumber, int secondNuber, int thirdNumber) {
		if (firstNumber > secondNuber && firstNumber > thirdNumber)
			return firstNumber;
		else if (secondNuber > firstNumber && secondNuber > thirdNumber)
			return secondNuber;
		else
			return thirdNumber;
	}

	public static void main(String[] args) {
		checkLargestNumber();
	}

}
