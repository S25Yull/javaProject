
class Time{
	int hour;//0~23
	int minute;
	int second;
	
	
	//매개변수로 넘겨진 값이 유효한지 확인하는 메소드
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return;
		this.hour = hour;
		
	}
	public int getHour() {return hour;};
}

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t = new Time();
		//t.hour = -100;
		t.setHour(21);
		System.out.println(t.getHour());
	}

}
