package SetC1;
import java.util.Scanner;

public class Person1 {
    private int id;
    private String name;
    private MyDate4 dob;
    private static int cnt = 1;

    // Default constructor
    public Person1() {
        this.id = cnt++;
        this.name = "";
        this.dob = new MyDate4();
    }

    // Parameterized constructor
    public Person1(String name, MyDate4 dob) {
        this.id = cnt++;
        this.name = name;
        this.dob = dob;
    }

    // Accept method
    public void acceptDetails(Scanner sc) {
        System.out.print("Enter name: ");
        this.name = sc.next();
        this.dob = new MyDate4();
        this.dob.acceptDate(sc);
    }

    // Display method
    public void displayDetails() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        this.dob.displayDate();
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        Person1[] persons = new Person1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));
            persons[i] = new Person1();
            persons[i].acceptDetails(sc);
        }

        System.out.println("\n--- Person Details ---");
        for (Person1 p : persons) {
            p.displayDetails();
            System.out.println("----------------------");
        }

        sc.close();
    }
}
