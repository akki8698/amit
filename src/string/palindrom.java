package string;

public class palindrom {

	public static void main(String[] args) {
	
		String org ="wow";
		String rev="";
		
		for (int i = org.length()-1; i>=0; i--) {
			
			rev= rev+org.charAt(i);
			
		}
		System.out.println(rev);

	
	
	if(org.equals(rev)) {
		System.out.println("given information is palidrom");
	}
	else {
		System.out.println("not palidrom");
	}

}
}
