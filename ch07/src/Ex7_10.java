
public class Ex7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit[]group= {new Marine(),new Tank(),new Dropship() };
		
		for(int i = 0;i<group.length;i++)
			group[i].move(100, 200);
	}

}

abstract class Unit{
	int s,y;
	abstract void move(int x,int y);
	void stop() {/*현재 위치에 정지*/}
}
class Marine extends Unit{ //보병
	void move(int x,int y) {
		System.out.println("Marine[x="+x+",y="+y+"]");
	}
	void stimPack() {/*스팀팩을 사용한다*/}
}

class Tank extends Unit{
	void move(int x,int y) {
		System.out.println("Tank[x="+x+",y="+y+"]");
	}
	void changeMode() {/*공격모드를 변환한다*/}
}
class Dropship extends Unit{ //보병
	void move(int x,int y) {
		System.out.println("Dropship[x="+x+",y="+y+"]");
	}
	void stimPack() {/*스팀팩을 사용한다*/}
}