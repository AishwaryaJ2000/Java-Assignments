package Test_Programs;
import java.util.*;

public class Test55 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in)) {
	System.out.println("enter num:");
	int x = sc.nextInt();
	if(x % 3 == 0) {
		System.out.println("num is divisible by 3");
	}else if(x % 5 == 0){
	System.out.println("num is divisible by 5");
	}else {
		System.out.println("Default no ");
	}
}
	}

}