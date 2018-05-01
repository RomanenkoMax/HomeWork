package it.dan;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		
		System.out.println(getSumFirst(number));
		System.out.println(getSumSecond(number));
	}

	private static int getSumSecond(int number) {
		Integer num = number;
		int sum = 0;
		char[] arr = num.toString().toCharArray();
		for(int i = 0; i < arr.length; i++) {
			sum += Character.getNumericValue(arr[i]);
		}
		
		return sum;
	}

	private static int getSumFirst(int number) {
		int sum = 0;
		while(number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}

}
