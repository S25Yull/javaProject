package ch03;

public class EX3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000; 
		int b = 2_000_000;
		
//		long c = a * b;
//		System.out.println(c);//overflow
		
		long c = (long)a * b;
		System.out.println(c);
	}

}
