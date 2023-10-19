package com.Codevandana;

import java.util.*;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {1,2,3,4,5,6,7};
		Shuffle (arr);
		for (int num: arr) {
			System.out.print(num+" ");
		}

	}
	public static void Shuffle (int arr[]) {
		Random rand=new Random ();
		for (int i =arr.length-1;i>0;i--) {
			System.out.println(i);
			int j=rand.nextInt(i+1);
			System.out.println(j);
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
	}

}
