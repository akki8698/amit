package Logicalprogram;

import java.util.Scanner;

public class Imp_even_odd {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i <=5; i++) {
			System.out.println("enter number :");
			
			int num = scan.nextInt();
			
			if(num % 2 == 0) {
				System.out.println("given number is even");
			}
			else {
				System.out.println("given number is odd");
			}
		}
		
		
		

	}

}
