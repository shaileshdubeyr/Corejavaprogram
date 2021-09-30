package com.myjava;

import java.util.*;

public class PrintHarmonicNumber {
	public void harmonicNumber(int harmonicLimitValue) {
		final int ONE = 1;
		System.out.println("Computatio of harmonic number is");
		for (int i = ONE; i <= harmonicLimitValue; i++) {
			System.out.printf("1/%d ", i);
			if (i < harmonicLimitValue)
				System.out.printf("+ ");
		}

	}

	public int userInput() {
		Scanner userInputObj = new Scanner(System.in);
		System.out.println("Enter the number to print harmonic");
		int harmonicLimitInput = userInputObj.nextInt();
			return harmonicLimitInput;
	}

	public static void main(String[] args) {
		PrintHarmonicNumber harmonicValuePrintObj = new PrintHarmonicNumber();
		int harmonicLimitValue = harmonicValuePrintObj.userInput();
		if(harmonicLimitValue > 0 )
			harmonicValuePrintObj.harmonicNumber(harmonicLimitValue);
		else
			System.out.println("Input invalid input");
	}
}
 