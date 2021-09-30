package com.myjava;

import java.util.Scanner;

public class ToCheckVowelOrConsonant {
	public void checkEvenOrOdd(char enteredCharater) {
		if (enteredCharater == 'a' || enteredCharater == 'e' || enteredCharater == 'i' || enteredCharater == 'o'
				|| enteredCharater == 'u')
			System.out.println("the charater is vowel");
		else
			System.out.println("the charater is consonent");
	}

	public char userInput() {
		Scanner userInputObj = new Scanner(System.in);
		char inputValue = userInputObj.next().charAt(0);
		return inputValue;
	}

	public static void main(String[] args) {
		ToCheckVowelOrConsonant alphabetObj = new ToCheckVowelOrConsonant();
		System.out.println("entered the chatrater");
		char inputCharater = alphabetObj.userInput();
		alphabetObj.checkEvenOrOdd(inputCharater);
	}
}
