
public class Ex7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		fe2 =(FireEngine)car;
		fe2.water();
	}//main

}
class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive,Brrrr");
	}
	void stop() {
		System.out.println("stop!!");
	}
}//car

class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}//FireEngine