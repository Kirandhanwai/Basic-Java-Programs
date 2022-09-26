package com.bridgelabz;

import java.util.Scanner;

public class SumOfNumber {
	
	static void main(String[] args) {
		int A;
		int B;
		System.out.println("Number 1");
		Scanner sc =new Scanner(System.in);
		A = sc.nextInt();
		System.out.println("Number 2");
		B = sc.nextInt();
		int sum = 0;
		int small;
		int big;
		if (A > B) {
			big = A;
			small  = B;
		}
		else { 
			big = B;
			small = A;
		}
	for (int i=small ;i<= big;i++) 
		sum = sum + i;
	
		System.out.println("Sum of the Number in a given range "+ sum);
		sc.close();
	}

}
