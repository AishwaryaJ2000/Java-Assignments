package Test_Programs;

public class Test25 {
	int x =20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test25 t = new Test25();
		Test25 s = new Test25();
//		x= x+s;
		t.x =s.x+5;
		System.out.println(t.x);
	}

}
