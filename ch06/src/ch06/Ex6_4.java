package ch06;

public class Ex6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		long result1=mm.add(5L,3L);
		long result2=mm.subtrack(5L,3L);
		long result3=mm.multiply(5L,3L);
		double result4=mm.divide(5L,3L);
		
		System.out.println("add(5L,3L)"+result1);
		System.out.println("subtrack(5L,3L)"+result2);
		System.out.println("multiply(5L,3L)"+result3);
		System.out.println("divide(5L,3L)"+result4);
	}

}
class MyMath{
	long add(long a, long b) {
		long result = a + b;
		return result;
	}

	public double divide(double l, double m) {
		// TODO Auto-generated method stub
		double result = l / m;
		return result;
	}

	public long multiply(long l, long m) {
		// TODO Auto-generated method stub
		long result = l * m;
		return result;
	}

	public long subtrack(long l, long m) {
		// TODO Auto-generated method stub
		long result = l - m;
		return result;
	}
}
