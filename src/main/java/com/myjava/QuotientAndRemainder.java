package com.myjava;

import java.util.Scanner;

public class QuotientAndRemainder {
	public int userInput() {
		Scanner userInputObj = new Scanner(System.in);
		int harmonicLimitInput = userInputObj.nextInt();
			return harmonicLimitInput;
	}
	public void division(int dividend, int divisor) {
		int quotient;
		int remainder;
		System.out.println("the dividend is "+dividend);
		System.out.println("the divisor is "+divisor);
		quotient = dividend / divisor;
		remainder = dividend % divisor;
		System.out.printf("the quotient is % the remainder is %d ",quotient,remainder);
	}
	public static void main(String[] args) {
		QuotientAndRemainder divisionObj = new QuotientAndRemainder();
		System.out.println("Enter the dividend");
		int dividend = divisionObj.userInput();
		System.out.println("Enter the divisor");
		int divisor = divisionObj.userInput();
		divisionObj.division(dividend, divisor);
	}

}
