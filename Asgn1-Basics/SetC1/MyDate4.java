package SetC1;
import java.util.Scanner;

public class MyDate4 {
    private int dd, mm, yy;

    // Default constructor
    public MyDate4() {
        this.dd = 1;
        this.mm = 1;
        this.yy = 2000;
    }

    // Parameterized constructor
    public MyDate4(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    // Accept method
    public void acceptDate(Scanner sc) {
        System.out.print("Enter day (dd): ");
        this.dd = sc.nextInt();
        System.out.print("Enter month (mm): ");
        this.mm = sc.nextInt();
        System.out.print("Enter year (yy): ");
        this.yy = sc.nextInt();
    }

    // Display method
    public void displayDate() {
        System.out.println("Date of Birth: " + this.dd + "-" + this.mm + "-" + this.yy);
    }
}

