package com.bridgelabz;

import java.util.Scanner;

public class PostiveNegativeNumber {

	public static void main(String[] args) {
		int num ;
		System.out.println("Enter Number");
			Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		
		if (num > 0) 
			System.out.println("Number is Positive");
		
		else if (num < 0) 
			System.out.println("Number is negative");
		
		else 
			System.out.println("Number is Zero");
		
		

	}

}
