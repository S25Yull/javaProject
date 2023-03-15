package ch04;

import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0, sum = 0;
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String tmp = "12345";//tmp를 입력받았다고 가정
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			//나머지를 sum에 누적
			sum+=num%10;
			System.out.printf("sum=%3d num=%d%n",sum,num);
			num/=10;
		}
		System.out.println("각 자릿수의 합"+sum);
	}

}
