package ch11;
import java.util.*;
public class Ex11_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new TreeSet(); //트리셋은 정렬필요없음 해쉬셋은 정렬필요함
		
		for(int i=0;set.size()<6;i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
	}

}
