package string;

public class Method1 {

	public static void main(String[] args) {
		String s1 = "velocity";
		String s2 = "VELOCITY";
		
		if(s2.equals(s1)) {
			System.out.println("info is same");
		}
		else {
			System.out.println("info is differnt");
		}
		
		if(s2.equalsIgnoreCase(s1)) {
			System.out.println("info is ok");
		}
		else {
			System.out.println("info is differnt");
		}
		String s3= "akshay";
		System.out.println(s3.replace("a", "v"));

	}

}
