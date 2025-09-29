package Test_Programs;

public class Test24 {
	int x = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test24 t = new Test24();
		Test24 s = new Test24();
		s.x = t.x+5;
		t.x = s.x+5;
		System.out.println(s.x);
		
		
	}

}
