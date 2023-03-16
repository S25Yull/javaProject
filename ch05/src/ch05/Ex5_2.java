package ch05;

public class Ex5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		float average = 0f;
		int[]score = {100,88,100,100,90};
		for(int i=0; i<score.length;i++) {
			sum+=score[i];//sum에 score의 값 누적
		}
		average = sum / (float)score.length;//형변환, sum에서 나눔, 형변환은 둘중 하나만 하면 됨
		
		System.out.println("총합 :"+sum);
		System.out.println("평균 :"+average);
	}

}
