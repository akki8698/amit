package Akkiprogarm;

public class String_middle_reverse {

	public static void main(String[] args) {
		
		String str = "abc aab pqr";
		
		String ar[]  = str.split(" ");
		
		for (int i = 0; i < ar.length-1; i++) {
			if((i%2)!=0) {
				String s1= ar[i];
				ar[i]= Revstring1(s1);
						
			}
			
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i] +" ");
		}	
		}
		public static String Revstring1(String inp) {
			String rev ="";
			for (int j = inp.length()-1; j>=0; j--) {
				rev = rev+inp.charAt(j)	;
			}
			return rev;
		
		

	}

}
