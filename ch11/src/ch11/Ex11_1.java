package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
		
		
		
		Collections.sort(list1);//list1, list2를 정렬한다 오름차순
		Collections.sort(list2);
		print(list1,list2);
	}

	private static void print(ArrayList list1, ArrayList list2) {
		// TODO Auto-generated method stub
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println("======");
		
	}

}
