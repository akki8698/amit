package string;

public class Stringclass {

	public static void main(String[] args) {
		 String s1 = "Akshay";
		 
		 System.out.println(s1.toUpperCase());
		 System.out.println(s1.toLowerCase());
		 System.out.println(s1.length());
		 System.out.println(s1.charAt(2));
		 System.out.println(s1.indexOf("k"));
		 System.out.println(s1.lastIndexOf("y"));
		 
		String s2 = "Aks";
		if(s1.contains(s2)) {
			System.out.println("info is same");
		}
		else {
			System.out.println("info is different");
		}	
			
		}
		 

	}


