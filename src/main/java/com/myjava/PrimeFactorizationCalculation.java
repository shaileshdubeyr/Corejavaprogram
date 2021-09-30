package com.myjava;

import java.util.*;
public class PrimeFactorizationCalculation {
	public void calculatingPrimeFactor(int inputValue) {
		final int CONSTANT_ONE = 1;
		final int CONSTANT_ZERO = 0;
		final int CONSTANT_NINE = 1;
		int factorizationValue = 2;
		int holdingInputValue = inputValue;
		System.out.println("the prime factorization value is");
		while(holdingInputValue > CONSTANT_NINE ) {
			if(holdingInputValue % factorizationValue == CONSTANT_ZERO) {
				System.out.printf("%d ", factorizationValue);
				holdingInputValue = holdingInputValue / factorizationValue;
			}else
				factorizationValue++;
		}
	}
	public int userInput(){
		Scanner inputVlaue = new Scanner(System.in);
		System.out.println("ente the value to calculate Primefacrorization");
		int factorizationValue = inputVlaue.nextInt();
		return factorizationValue;
	}
	public static void main(String[] args) {
		PrimeFactorizationCalculation primeFactorzationObj = new PrimeFactorizationCalculation();  
		int inputValue = primeFactorzationObj.userInput();
		primeFactorzationObj.calculatingPrimeFactor(inputValue);
	}

}
