package ch08;

//예외 되던지기

public class Ex8_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		}catch(Exception e) {
			System.out.println("main메서드에서 예외가 처리되었습니다");
		}
	}//main

	private static void method1() throws Exception {
		// TODO Auto-generated method stub
		try {
			throw new Exception();
		}catch(Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다");
			throw e;
		}
	}//method1

}
