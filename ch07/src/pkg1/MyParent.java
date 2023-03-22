package pkg1;


public class MyParent{
	private int prv;//같은클래스\
	int dft;//같은패키지
	protected int prt;//같은클래스 자손
	public int pub;//접근제한없음
	
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
	
}


 class MyParentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyParent p= new MyParent();
		//System.out.println(p.prv);
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}
