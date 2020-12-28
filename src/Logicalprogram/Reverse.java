package Logicalprogram;

public class Reverse {

	public static void main(String[] args) {
	 
//		String s1= "akki";
//		String s2="";	
//		for (int i = 3; i >=0; i--) {		
//			s2= s2+s1.charAt(i);	
//		}
//		System.out.println(s2);
//	}
		String org = "aba";
		String rev ="";
		
		for (int i = org.length()-1; i>=0; i--) {
			rev = rev+org.charAt(i);	
		}
		System.out.println(rev);
		
		if(org.equals(rev)) {
			System.out.println("given string is palindrome");
		}
		else {
			System.out.println("given string is not palindrome");
		}
		
		
	
	}
}
