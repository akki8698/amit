package Logicalprogram;

public class Imp_primenumber {

	public static void main(String[] args) {
		
		int num = 20;
		int count =0;
		
		for (int i = 2; i < num; i++) {
			
			if(num % i ==0) {
				count++;
				break;
			}
		}
			if(count == 1) {
				System.out.println("given number is not prime number");
			}
			else {
				System.out.println("given number is prime number");
			}
		}

	

}
