package Akkiprogarm;

public class Primenumber {

	public static void main(String[] args) {
		
		int num  =6;
		int count= 0;
		
		for (int i = 2; i <num; i++) {
			if(num%2==0) {
				count++;
				break;
				
			}
			
		}
		if(count==1) {
			System.out.println("not prime number");
		}
		else {
			System.out.println("prime num");
		}

	}

}
