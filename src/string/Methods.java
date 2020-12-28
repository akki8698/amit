package string;

public class Methods {

	public static void main(String[] args) {
	
		String s1 = "velocity";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		System.out.println(s1.charAt(4));
		System.out.println(s1.lastIndexOf("y"));	
		
		String s2= "Velocity";
		System.out.println(s2.startsWith("Veloc"));
		System.out.println(s2.endsWith("abc"));
		
		String s3= "Akshay";
		System.out.println(s3.replace("k", "d"));
		
		String s4 = "yogesh";
		String s5 = "tuptewar";
		
		System.out.println(s4.concat(s5));

	}

}
