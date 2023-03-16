package ch05;

public class Ex5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[]score = {79,88,91,33,100,55,95};
			
			int max = score[0];//배열의 첫번째 값으로 초기화
			int min = score[0];
			
			for(int i = 1; i<score.length;i++) {//변수에 인덱스 0이 저장되어 있기 때문에 1부터 가능
				if(score[i]>max) {
					max = score[i];
				}
				else if(score[i]<min) {
					min = score[i];
				}
			}//for
			System.out.println("최대값 :"+max);
			System.out.println("최소값 :"+min);
	}

}
