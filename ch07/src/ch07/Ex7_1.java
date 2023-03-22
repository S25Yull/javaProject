package ch07;

class Tv{ //부모 클래스 멤버 5개
	boolean power;
	int channel;
	
	void power() {power =! power;}
	void channelUp() {++channel;}
	void channelDown() { --channel;}
}

	class SmartTv extends Tv{ //자식 클래스 원래 멤버2개+부모 5개
		boolean caption;
		void displayCaption(String text) {
			if(caption) {
				System.out.println(text);
			}
		}
	}
	



public class Ex7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv stv = new SmartTv();
	    stv.channel =10;
	    stv.channelUp();
	    System.out.println(stv.channel);
	    stv.displayCaption("Hello,World");
	    stv.caption = true;
	    stv.displayCaption("Hello,World");
	}

}
