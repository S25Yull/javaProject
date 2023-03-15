package ch02;

public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(10.0/3);
		
//		System.out.printf("%d%n",15);
//		System.out.printf("%#o%n",15);
//		System.out.printf("%#x%n",15);
//		System.out.printf("%s",Integer.toBinaryString(15));
//		
//		float f = 123.456789f;
//		System.out.printf("%f%n",f);
//		
//		double f1 = 123.456789;
//		System.out.printf("%f%n",f1);
		
		System.out.printf("[%5d]%n",1000000);
		System.out.printf("[%-5d]%n",10);
		System.out.printf("[%05d]%n",10);
		
		double d = 1.23456789;
		System.out.printf("%14.10f%n",d);
		System.out.printf("[%s]%n","www.codechobo.com");
		System.out.printf("[%20s]%n","www.codechobo.com");
		System.out.printf("[%-20s]%n","www.codechobo.com");
		
	}

}
