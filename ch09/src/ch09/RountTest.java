package ch09;

public class RountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(double d = 0.0 ; d<=2.0;d+=0.1) {
			double d1 = Math.round(d);
			double d2 = Math.rint(d);
			
			 System.out.printf("%4.1f %4.1f %4.1f%n",d,d1,d2);
		}//for
		
		
		System.out.println("=========");
		
		int i = Integer.parseInt("100");
		System.out.println("i="+Integer.parseInt("100"));
		System.out.println("i="+Integer.parseInt("100",10));//10진수
		System.out.println("i="+Integer.parseInt("100",2));//2진수
		System.out.println("i="+Integer.parseInt("FF",16));//16진수
	}//main

}
