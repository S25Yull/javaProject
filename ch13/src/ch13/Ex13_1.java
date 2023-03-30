package ch13;

public class Ex13_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx1_1 t1 = new ThreadEx1_1();
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}

}
//두개의 쓰레드를 생성
class ThreadEx1_1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(this.getName());
		}
	}
}
class ThreadEx1_2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
