package Akkiprogarm;

import java.util.Scanner;

public class Largestof3number {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter first number:-");
		 int a = scan.nextInt();
		 
		 System.out.println("enter second number:-");
		 int b = scan.nextInt();
		 
		 System.out.println("enter third number:-");
		 int c = scan.nextInt();
		 
		  int largest1 = a>b?a:b;
		  int largest2= c>largest1?c:largest1;
		  System.out.println("largest number is:-"+largest2);
		

	}

}
