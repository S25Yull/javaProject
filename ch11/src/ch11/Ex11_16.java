package ch11;
import java.util.*;
public class Ex11_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap(); //키랑 밸류로 나누어짐
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");//아이디 비번 변경됨
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 pw를 입력해주세요");
			System.out.println("id:");
			String id = s.nextLine().trim();
			
			System.out.println("password :");
			String password = s.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {//!때문에 not
				System.out.println("입력하신 아이디는 존재하지 않습니다");
				continue;
			}//if
			if(!(map.get(id)).equals(password)) { //아이디 값을 패스워드랑 비교
				System.out.println("비밀번호가 일치하지 않습니다");
			}else {
				System.out.println("아이디와 비밀번호가 일치합니다");
				break;
			}
		}//while
	}//main

}
