package ch11;
import java.util.*;
public class Ex11_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1"); setA.add("2"); setA.add("3");
		setA.add("4"); setA.add("5");
		
		System.out.println("A="+setA);
		
		setB.add("4"); setB.add("5"); setB.add("6");
		setB.add("7"); setB.add("8");
		
		System.out.println("B="+setB);
		
		
		//교집합 setA.retainAll(setB);도 가능 ==공통된 요소만 남기고 삭제
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp)) { //contains가 포함하고 있는지 확인
				setKyo.add(tmp); //존재하면 교집합 안에 포함
			}
		}
		
		//차집합 setA.removeAll(setB); setB의 공통 요소를 제거
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) { //A를 돌면서 B에 없는것만 저장
				setCha.add(tmp);
			}
		}
		//합집합 setA.addAll(setB); setB의 모든 요소를 추가(중복제외)
		it = setA.iterator();//A를 읽고 다 집어넣음
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		
		it = setB.iterator();//B를 읽고 다 집어넣음
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		System.out.println("교집합"+setKyo);
		System.out.println("합집합"+setHab);
		System.out.println("차집합"+setCha);
	}//main

}
