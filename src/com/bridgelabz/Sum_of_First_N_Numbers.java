package com.bridgelabz;

import java.util.Scanner;

public class Sum_of_First_N_Numbers {
	static void m1() {
	System.out.println("Enter Number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int sum = 0;
	
	for(int i=1; i<=num; i++)
		sum += i;  // sum = sum + i
	System.out.println(sum);
	sc.close();
	}

	public static void main(String[] args) {
		m1();
	
	}  

}
