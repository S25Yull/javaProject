package ch07;


class Point3{
	int x;
	int y;
	String getLocation() {
		return "x:"+x+",y:"+y;
	}
}


class MyPoint3D extends Point3{
	int z;
	
	//조상의 getLocation()을 오버라이딩 
	String getLocation() {
		return "x:"+x+",y:"+y+",z:"+z;
	}
	
}

public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint3D p = new MyPoint3D();
		p.x=3;
		p.y=5;
		p.z=7;
		System.out.println(p.getLocation());
	}

}
