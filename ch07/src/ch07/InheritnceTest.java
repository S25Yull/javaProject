package ch07;

class MyPoint{
	int x;
	int y;
}
/*class Circle extends MyPoint{//상속
	int r;
}*/

class Circle{//포함
	MyPoint p = new MyPoint();
	int r;
}


public class InheritnceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.p.x = 1;
		c.p.x = 2;
		c.r = 3;
		System.out.println("c.x="+c.p.x);
		System.out.println("c.y="+c.p.x);
		System.out.println("c.r="+c.r);
	}

}
