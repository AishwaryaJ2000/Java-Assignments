package SetA2Series2;
import java.util.Scanner;

public class MainSeries2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        new Fibonacci2().printSeries(n);
        new Cube2().printSeries(n);
        new Square2().printSeries(n);

        sc.close();
    }
}
