package ch06;

public class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white","auto",4);
	}
	Car2(String color){
		this(color,"auto",4);//코드의 중복을 제거한 코드 밑에거랑같은거임
	}
	Car2(String color, String geartype, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
