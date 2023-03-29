package ch11;
import java.util.*;
public class Ex11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		
		for(int i=0; set.size()<6;i++) { //set의 크기가 6보다 작은동안 1~45사이의 난수를 저장
			int num =(int)(Math.random()*45)+1;//set은 정렬할수 없음
			set.add(new Integer(num));
		}
		List list = new LinkedList(set);//set을 정렬하기 위해 list에 넣음
		Collections.sort(list);
		System.out.println(list);
	}

}
