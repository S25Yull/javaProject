import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//익명클래스

public class Ex7_18 {

	public static void main(String[] args) {
		// TODO Auto-gØenerated method stub
		Button b = new Button("Start");
		
		
		b.addActionListener(new ActionListener() { //클래스의 정의와 객체 생성을 동시에
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
		}
				
		});
		
		
	}

}

	
	
