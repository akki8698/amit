package Akkiprogarm;

import java.util.Arrays;

public class Arraycomparision {

	public static void main(String[] args) {
		int ar1 [] = {10,20,30};
		int ar2 [] = {10,20,30};
		int ar3 [] = {100,20,30};
		
		System.out.println(Arrays.equals(ar1, ar2));
		System.out.println(Arrays.equals(ar1, ar3));
		System.out.println(Arrays.equals(ar3, ar2));

	
	}
}
