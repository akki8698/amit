package Akkiprogarm;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		int count = 0;
		String s1= "1 1 1 1 1 1";
		
		for (int i = 0; i<=s1.length()-1; i++) {
			char str = s1.charAt(i);
			if(str==' ') {
				count++;
			}
			
		}
		System.out.println(count);
       
	}

}
