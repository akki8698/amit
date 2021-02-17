package Akkiprogarm;

import java.util.Scanner;

public class Akkkkki {

	public static void main(String[] args) {
	
		int count=0;
		
		String str = "1 2 3    ";
		
		for (int i = 0; i <=str.length()-1; i++) {
		
			char a = str.charAt(i);
			
			if(a==' ') {
				count++;
			}
			
		}
		System.out.println(count);
	        

	}

}
