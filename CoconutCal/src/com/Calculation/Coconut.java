package com.Calculation;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Coconut {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
		System.out.println("please enter your coconuts::");
		int coconuts=sc.nextInt();
		if(coconuts<=0) {
			System.out.println("enter valid cocnuts");
		}
		else {
		int coconuts1=(int) (coconuts*0.022);
		System.out.println("nadem kayalu::"+coconuts1);
		int original=coconuts-coconuts1;
		System.out.println("original coconuts::"+original);
		System.out.println("enter rate of the coconut::");
		double rate=sc.nextDouble();
		int amount=(int) (rate*original);
		System.out.println("total amount::"+amount);
		int chess=(int) (amount*0.01);
		System.out.println("chess::"+chess);
		int aftchess=amount-chess;
		System.out.println("afterchess::"+aftchess);
		int nadem=(int)(coconuts*0.08);
		System.out.println("nadem amount::"+nadem);
		int final1=aftchess-nadem;
		System.out.println("final amount::"+final1);
		
		}
		
			
		}
		catch(Exception e) {
			System.out.println("please enter correct input");

	}
		finally {
			System.out.println("----------!-----------");
			System.out.println("thank you!please visit again");
			System.out.println("DATE:"+LocalDate.now());
			System.out.println("TIME:"+LocalTime.now());
			
		}
	}
}
