package ch08;

public class Ex8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);//예외가 발생한 이후의 문장은 수행되지 않는다.
			
		}catch(ArithmeticException ae) {
				if(ae instanceof ArithmeticException)
					System.out.println("true");
				System.out.println("ArithmeticException");
			}catch(Exception e) {  //Exception은 제일 마지막에 와야됨 , 최고조상
				System.out.println("Exception");
		}//try-catch의 끝
		System.out.println(6);
	}

}
