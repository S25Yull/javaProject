package ch05;

import java.util.Arrays;

public class Ex5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0;i<numArr.length;i++) {
			int n = (int)(Math.random()*10); //오름차순 정렬을 0에서 9까지 임의로 100번섞기
			int tmp = numArr[i]; //i랑 n번째랑 바꾸기
			numArr[0] = numArr[n];
			numArr[i] = tmp;
		}//for
		System.out.println(Arrays.toString(numArr));
	}

}
