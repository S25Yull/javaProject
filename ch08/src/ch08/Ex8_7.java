package ch08;

public class Ex8_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new Exception();
		}catch(Exception e) {}
		
		throw new RuntimeException();
		
	}

}
