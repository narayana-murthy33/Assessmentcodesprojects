package com.Codevandana;

import java.util.*;

public class RomanToInteger {
	public static void main(String[] args) {
		 String romanNumeral = "IX";
	        int integerValue = romanToInteger(romanNumeral);
	        System.out.println("Integer value: " + integerValue);

	}
	
	public static  int romanToInteger(String roman) {
		Map<Character,Integer> romanToIntegerMap=new HashMap();
		  romanToIntegerMap.put('I', 1);
	        romanToIntegerMap.put('V', 5);
	        romanToIntegerMap.put('X', 10);
	        romanToIntegerMap.put('L', 50);
	        romanToIntegerMap.put('C', 100);
	        romanToIntegerMap.put('D', 500);
	        romanToIntegerMap.put('M', 1000);

	        int result = 0;
	        int prevValue = 0;
	        for (int i = roman.length() - 1; i >= 0; i--) {
	            char currentChar = roman.charAt(i);
	            int currentValue = romanToIntegerMap.get(currentChar);

	            if (currentValue < prevValue) {
	                result -= currentValue;
	                System.out.println("helo"+result);
	            } else {
	                result += currentValue;
	                System.out.println("hii"+result);
	            }

	            prevValue = currentValue;
	        }

		
		
		
		
		
		
		
		return result;
	}

}
