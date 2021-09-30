package com.myjava;

import java.util.*;

public class CheckLeapYear {
	public void leapYear() {
		final int VALUE_LEAP = 4,ZERO = 0, THREE_NIE = 999, FOUR_NINE = 9999; 
		int enteredYear = userInputYear();
		if (enteredYear > THREE_NIE && enteredYear < FOUR_NINE) {
			if (enteredYear % VALUE_LEAP == ZERO)
				System.out.println("It is a leap year");
			else
				System.out.println("Entered year  is not a leap year");
		} else
			System.out.println("entered invalid input");
	}

	static int userInputYear() {
		Scanner scanYear = new Scanner(System.in);
		System.out.print("Enter the 4 digit year to check it is leap year or not ");
		int year = scanYear.nextInt();
		return year;
	}

	public static void main(String[] args) {
		CheckLeapYear leapYearFunctionObj = new CheckLeapYear();
		leapYearFunctionObj.leapYear();
	}
}
