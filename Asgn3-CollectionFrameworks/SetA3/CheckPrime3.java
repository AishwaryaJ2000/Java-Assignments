package SetA3;
import java.util.*;

class ZeroException extends Exception {
    public ZeroException(String message) {
        super(message);
    }
}

public class CheckPrime3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            if (num == 0) {
                throw new ZeroException("Number is 0");
            }

            boolean isPrime = true;
            if (num < 2) isPrime = false;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.println(num + (isPrime ? " is a Prime number." : " is NOT a Prime number."));
        } catch (ZeroException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
