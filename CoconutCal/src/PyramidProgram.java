
import java.util.Scanner;

public class PyramidProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop to iterate through rows
        for(int i=1;i<=rows;i++) {
        	for(int j=1;j<=rows-1;j++) {
        		System.out.print(" ");
        	}
        	for(int k=0;k<=rows;k++) {
        		System.out.print("*");
        		
        	}
        	System.out.println();
        }
        
        }
    }