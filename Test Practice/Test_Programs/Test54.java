package Test_Programs;
import java.util.*;

public class Test54 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in)) {
	System.out.println("enter your age:");
	int age = sc.nextInt();
	if(age>0 && age<18) {
		System.out.println("kid");
	}else if(age>=18 && age<=60){
	System.out.println("adult");
	}else {
		System.out.println("senior");
	}
}
	}

}
