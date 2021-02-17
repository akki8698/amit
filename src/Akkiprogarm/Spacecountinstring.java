package Akkiprogarm;

public class Spacecountinstring {

	public static void main(String[] args) {
		
		int count= 0; 
		String str ="11  22  ";
		
		for (int i = 0; i<=str.length()-1; i++) {
			
			char a = str.charAt(i);
			if(a==' ') {
				count++;
			}
			
		}
		System.out.println(count);
		
		

	}

}
