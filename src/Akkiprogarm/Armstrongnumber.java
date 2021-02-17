package Akkiprogarm;

import java.util.Scanner;

public class Armstrongnumber {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number:-");
		    int num = scan.nextInt();
		    
		    int rem;
		    int sum=0;
		    
		    for (int i = num; i >0;i= i/10) {
		    	rem= i%10;
		    	sum=sum+(rem*rem*rem);
				
			}
		    if(num==sum) {
		    	System.out.println("given number"+num+"armstrong");
		    }
		    else {
		    	System.out.println("given number"+num+" notarmstrong");
		    	
		    }
		
		
		
	}

}
