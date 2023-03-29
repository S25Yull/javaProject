package ch12;

import java.util.ArrayList;

class Tv{}
class Audio{}

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tv> list = new ArrayList<Tv>(); //Tv타입의 객체만 저장가능
		list.add(new Tv());
		//list.add(new Audio());
	}

}
