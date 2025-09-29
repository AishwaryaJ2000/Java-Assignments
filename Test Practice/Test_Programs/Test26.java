package Test_Programs;
public class Test26{
	int x =20;
	public static void main(String[]args) {
		Test26 t = new Test26();
		Test26 s =new Test26();
		s.x =t.x+5;
		t.x = s.x+5;
		System.out.println(s.x);
	}
}