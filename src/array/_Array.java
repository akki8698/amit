package array;

import java.util.Arrays;

public class _Array {

	public static void main(String[] args) {
		
		int ar[]= {20,10,30,50,40};
		
//	int [] ar= new int[5];
//	ar[0]=20;
//	ar[1]=10;
//	ar[2]=30;
//	ar[3]=50;
//	ar[4]=40;
	
	String[]br=new String[3];
	br[0]="akki";
	br[1]="vkki";
	br[2]="bkki";
	
	System.out.println(br[0]);
	
	System.out.println("---before sorting----");
	
	for (int i = 0; i < ar.length; i++) {
		
		System.out.println(ar[i]);
		
	}{
		System.out.println("(----after sorting----");
		
		Arrays.sort(ar);{
			for (int i = 0; i < ar.length; i++) {
				System.out.println(ar[i]);
				
			}
			System.out.println("small number"+ar[0]);
			System.out.println("small number"+ar[ar.length-1]);
		}
		
		
	}

	}

}
