package SetB3;
import java.util.Scanner;

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

public class DoctorNameValidate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Doctor Name: ");
        String name = sc.nextLine();

        try {
            if (!name.matches("[a-zA-Z ]+")) {
                throw new InvalidNameException("Name is Invalid");
            } else {
                System.out.println("Valid Doctor Name: " + name);
            }
        } catch (InvalidNameException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
