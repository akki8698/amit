package Overloading;

public class Overload {

	public static void main(String[] args) {
		
		Overload d = new Overload();
		d.addition(10, 20);
		d.addition(10, 20, 100);
		
		
		
		
	}
			
		public  static void addition(int a, int b) {
			int c = a+b;
			System.out.println(c);
			
		}
		
		public  void addition(int a, int b , int c) {
			int d = a+b+c;
			System.out.println(d);
			
		}

	

}

