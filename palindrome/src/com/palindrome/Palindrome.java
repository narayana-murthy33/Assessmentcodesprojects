package com.palindrome;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String name=sc.next();
		System.out.println(name.length());
		
		palindrome(name);

	}
static void palindrome(String name) {
	char []arr1=name.toCharArray();
	String reverse="";
	for(int i=0;i<arr1.length;i++) {
		reverse=arr1[i]+reverse;
	}
	if(name.equalsIgnoreCase(reverse)) {
	System.out.println("it is palindrome");
	
}else {
	System.out.println("it is not palindrome");
}
}
}
