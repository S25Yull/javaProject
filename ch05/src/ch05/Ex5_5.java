package ch05;

public class Ex5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ball = new int[45];//45개의 정수값을 저장하기 ,로또번호 출력
		
		for(int i=0;i<ball.length;i++) {
			ball[i] = i+1;
		}
			
			
			int tmp = 0; //두 값을 바꿀 임시변수
			int j = 0; //임의의 값을 얻어서 저장할 변수
			for(int i=0;i<6;i++) {
				j=(int)(Math.random()*45);
				tmp = ball[i]; //먼저 비어있는 tmp변수에 원래 값(ball[i])을 담음
				ball[i] = ball[j]; //ball[i]가 비어있게 되고 거기에 ball[j]를 담음
				ball[j] = tmp; //ball[j]가 비어있게 되고 거기에 변수 tmp를 담음
				System.out.println(ball[j]);
		}
	}

}
