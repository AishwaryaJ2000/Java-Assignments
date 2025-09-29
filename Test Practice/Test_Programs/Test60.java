package Test_Programs;
import java.util.*;

public class Test60 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
Scanner Sc = new Scanner(System.in)) {
	int num;
	long fact =1;
	
	System.out.println("enter a positive number:");
	num = Sc.nextInt();
	if(num < 0) {
		System.out.println("factorial is not");
	}else {
		int i =1;
		do {
			fact *=i;
			i++;
		}while(i<=num);
		System.out.println("factorial of :" +fact);
	}
}
	}

}
