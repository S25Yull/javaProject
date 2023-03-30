package ch13;

import javax.swing.JOptionPane;

public class ThreadEx6 {
	//싱글쓰레드 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input= JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은"+input+"입니다");
		
		for(int i=10;i>0;i--) { //입력을 해야 카운트다운이 시작된다 //멀티쓰레드는 입력을 안해도 카운트다운이 시작된다
			System.out.println(i);
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}

}
