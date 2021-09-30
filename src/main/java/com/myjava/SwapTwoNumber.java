package com.myjava;

import java.util.Scanner;

public class SwapTwoNumber {

	public int userInput() {
		Scanner userInputObj = new Scanner(System.in);
		int inputValue = userInputObj.nextInt();
		return inputValue;
	}

	public void swapingOfNumber(int firstNumber, int secondNumber) {
		int temp;
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		System.out.printf("the first number is %d \nthe second number is %d\n", firstNumber, secondNumber);
	}

	public static void main(String[] args) {
		SwapTwoNumber swapNumberObj = new SwapTwoNumber();
		System.out.println("enter the first number");
		int firstNumber = swapNumberObj.userInput();
		System.out.println("enter the second number");
		int secondNumber = swapNumberObj.userInput();
		swapNumberObj.swapingOfNumber(firstNumber, secondNumber);
	}
}
