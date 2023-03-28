import java.text.DecimalFormat;

public class Ex10_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89");
			System.out.println("1,234,567.89"+"->");
			
			double d = num.doubleValue();//여기서 콤마 없앰
			System.out.println(d+"->");
			
			System.out.println(df2.format(num));
		}catch(Exception e) {}
	}

}
