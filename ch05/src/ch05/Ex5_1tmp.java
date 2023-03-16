package ch05;

import java.util.Arrays;

public abstract class Ex5_1tmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score; //1.배열 score을 선언 (참조변수)
		score = new int[5]; //2.배열의 생성
		//int[]score = new int[];
		//Arrays.toString(배열명);
		//컨트롤 시프트 o 전체 임포트
		score[3] = 100;
		System.out.println("score[0]"+score[0]);
		System.out.println("score[1]"+score[1]);
		System.out.println("score[2]"+score[2]);
		System.out.println("score[3]"+score[3]);
		System.out.println("score[4]"+score[4]);
		
		int value = 100;
		System.out.println("value="+value);
		System.out.println("=======");
		int[]arr = new int[10];
		System.out.println("arr.length="+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]"+arr[i]);
		}
		System.out.println("=======");
		System.out.println("=======");
		int [] iArr = {100,95,80,70,60};
		for(int i=0;i<iArr.length;i++) {
			System.out.println(iArr);
		}//for
		System.out.println(Arrays.toString(iArr));
	}

}
