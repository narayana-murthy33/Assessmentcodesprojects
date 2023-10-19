package com.palindrome;

import java.util.Scanner;

public class Noofdigits {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("number enter please");
		int number=sc.nextInt();
		noofdigits(number);
	}

	private static void noofdigits(int number) {
		
		int numberofdigits=0;
		
		while(0<number) {
			System.out.println(number);
			
			number=number/10;
			numberofdigits++;
			
		}
         System.out.println("number of digits"+numberofdigits);
	}

}