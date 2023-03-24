abstract class Unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다");}
}

interface Fightable{
	void move(int x, int y);//public abstract가 생략됨
	void attrack(Fightable f);//public abstract가 생략됨
}

class Fighter extends Unit2 implements Fightable{
	//오버라이딩 규칙 : 조상(public)보다 접근제어자가 범위가 좁으면 안된다.
    public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attrack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	
}

public class FighterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		f.move(100, 200);
		f.attrack(new Fighter());
	}

}
