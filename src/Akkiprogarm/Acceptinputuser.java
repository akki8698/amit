package Akkiprogarm;

import java.util.Scanner;

public class Acceptinputuser {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter student name:-");
		 String name = scan.next();
		 System.out.println("name:-"+name);
		 
		 System.out.println("enter roll number:-");
		int no= scan.nextInt();
		System.out.println("roll no:-"+no);

	}

}
