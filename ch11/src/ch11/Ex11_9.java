package ch11;
import java.util.*;
public class Ex11_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i=0;i<objArr.length;i++) {
			set.add(objArr[i]);//Hastset에 objArr의 요소들을 저장한다
		}
		//Hashset에 저장된 요소들을 출력한다
		System.out.println(set);
		
		//Hashset에 저장된 요소들을 출력한다(Iterator이용)
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
