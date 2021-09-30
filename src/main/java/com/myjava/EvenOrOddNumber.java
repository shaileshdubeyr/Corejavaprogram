package com.myjava;

import java.util.Scanner;

public class EvenOrOddNumber {
	public void checkEvenOrOdd(int enteredNumber) {
		final int TOW = 2;
		if (enteredNumber % TOW == 0)
			System.out.println("the number is even");
		else
			System.out.println("the number is odd");
	}

	public int userInput() {
		Scanner userInputObj = new Scanner(System.in);
		int inputValue = userInputObj.nextInt();
		return inputValue;
	}

	public static void main(String[] args) {
		EvenOrOddNumber objToCheckValue = new EvenOrOddNumber();
		System.out.println("Input the number to check even or odd");
		int inputValue = objToCheckValue.userInput();
		objToCheckValue.checkEvenOrOdd(inputValue);
	}

}
