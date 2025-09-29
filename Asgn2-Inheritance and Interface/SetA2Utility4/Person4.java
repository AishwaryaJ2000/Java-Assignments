package SetA2Utility4;
import java.util.Scanner;

public class Person4 {
    private String name;
    private String city;

    public void acceptDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter city: ");
        city = sc.next();
    }

    public void displayDetails() {
        System.out.println("Name: " + capitalString.capitalize(name));
        System.out.println("City: " + city);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person4 p = new Person4();
        p.acceptDetails(sc);
        p.displayDetails();
        sc.close();
    }
}
