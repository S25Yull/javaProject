package ch04;

public class Ex4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		for(int i=1;i<=5;i++) {
			num = (int)(Math.random()*6)+1;//괄호가 중요
			System.out.println(num); //6번 출력하고 난수 생성
			//1부터 5까지의 횟수 , 6까지중 아무거나 나옴
		}
	}

}
