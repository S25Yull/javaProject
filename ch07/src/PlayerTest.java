abstract class Player{ //추상 클래스 미완성 설계도
	abstract void play(int pos); //추상메서드
	abstract void stop();
}

//추상클래스는 상속을 통해 완성해야 객체 생성가능
class AudioPlyer extends Player{
	void play(int pos) {System.out.println(pos+"위치부터 play 합니다");}
	void stop() {System.out.println("재생을 멈춥니다");}
}
public class PlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Player p = new Player(); 
		AudioPlyer ap = new AudioPlyer();
		ap.play(100);
		ap.stop();
	}

}
