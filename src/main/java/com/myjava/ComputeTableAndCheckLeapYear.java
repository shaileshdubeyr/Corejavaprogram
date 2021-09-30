package com.myjava;

import java.util.*;

public class ComputeTableAndCheckLeapYear {
	static int userInput() {
		Scanner takeIntvalue = new Scanner(System.in);
		System.out.println("Enter the limit of table");
		int enteredValue = takeIntvalue.nextInt();
		return enteredValue;
	}

	static void printTable(double tableLimit) {
		final int CONSTANT_ONE = 1;
		final int CONSTANT_TWO = 2;
		final int CONSTANT_ZERO = 0;
		final int CONSTANT_TEN = 10;
		int tableOf = 1;
		for (int i = CONSTANT_ONE; i < tableLimit;) {
			tableOf = CONSTANT_TWO * tableOf;
			for (int j = CONSTANT_ONE; j <= CONSTANT_TEN; j++) {
				System.out.printf("%d x %d = %d\n", tableOf, j, tableOf * j);
			}
			if (tableOf % 4 == CONSTANT_ZERO)
				System.out.println("it is leapyear " + tableOf);
			else
				System.out.println("it is not a leap year " + tableOf);
			i = tableOf;
		}
	}

	public void checkLeapYear() {
		int ZERO = 0;
		int INPLESSTHEN = 31;
		double TWO = 2;
		double userInputValue = userInput();
		if (userInputValue >= ZERO && userInputValue < INPLESSTHEN) {
			userInputValue = Math.pow(TWO, userInputValue);
			printTable(userInputValue);
		} else
			System.out.println("input is not valid");
	}

	public static void main(String[] args) {
		ComputeTableAndCheckLeapYear objectForFunLeapyear = new ComputeTableAndCheckLeapYear();
		objectForFunLeapyear.checkLeapYear();
	}
}
