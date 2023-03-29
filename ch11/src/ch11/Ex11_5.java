package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list =  new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();//1회용이라서 다쓰고나면 다시 얻어와야 한다
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		 it = list.iterator();//1회용이라서 다쓰고나면 다시 얻어와야 한다
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
