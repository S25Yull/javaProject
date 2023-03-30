package ch12;

class Parent{
	void parentMethod() {}
}
class Child extends Parent{
	@Override
	@Deprecated
	void parentMethod() {}
}
interface Testable{
	void test();//추상메서드
	void check();//추상메서드
}

public class Ex12_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c =new Child();
		c.parentMethod();
	}

}
