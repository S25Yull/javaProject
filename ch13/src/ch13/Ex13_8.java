package ch13;

public class Ex13_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(2000); //th1을 2초동안 잠자게 함
		}catch(InterruptedException e) {}
		System.out.println("<<main종료>>");
	}//main

}

class ThreadEx8_1 extends Thread{
	public void run() {
		for(int i=0;i<300;i++)System.out.println("-");
		System.out.print("<<th1종료>>");
	}
}
class ThreadEx8_2 extends Thread{
	public void run() {
		for(int i=0;i<300;i++)System.out.println("|");
		System.out.print("<<th2종료>>");
	}
}
