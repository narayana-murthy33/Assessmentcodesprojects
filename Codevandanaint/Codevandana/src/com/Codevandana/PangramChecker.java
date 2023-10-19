package com.Codevandana;
import java.util.*;

public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over t";
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    
    public static boolean isPangram(String str) {
        str = str.replaceAll(" ", "").toLowerCase();
        System.out.println(str);
        
        int count=0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            
            if (ch >= 'a' && ch <= 'z') {
               
            	count++;
            }
        }
        
        
        return count == 26;
    }
}
