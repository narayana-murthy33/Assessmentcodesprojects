package com.Calculation;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("bubble sort");


 int []arr1= {2,8,5,6,3,7,4};
 System.out.println("Before Swaping");
	for(int h=0;h<arr1.length;h++) {
		
		System.out.print(arr1[h]);
	}
 
   for (int i=0;i<arr1.length;i++) {
	   for (int j=1;j<arr1.length;j++) {
		   if(arr1[j-1]>arr1[j]) {
				int temp=arr1[j-1];
				 arr1[j-1]=arr1[j];
				 arr1[j]=temp;
				
	   }
   }
	}
   System.out.println();
   System.out.println("After swaping");
	for(int h=0;h<arr1.length;h++) {
		
		System.out.print(arr1[h]);
	}
}}

