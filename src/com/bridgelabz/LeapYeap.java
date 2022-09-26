package com.bridgelabz;

import java.util.Scanner;

public class LeapYeap {
	static void m1() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year in terms of 4 digits");
		int year = scanner.nextInt();
		if ((year % 4 == 0) && ((year % 100) != 0) || (year % 400 == 0)) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		m1();
	}
}
