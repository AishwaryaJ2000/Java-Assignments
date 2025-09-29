package SetA2;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    public Employee() {
        id = 0;
        name = "";
        salary = 0.0;
    }

    public void accept(Scanner sc) {
        System.out.print("Enter ID: ");
        id = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    private double bonus;

    public void accept(Scanner sc) {
        super.accept(sc);
        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();
    }

    public double totalSalary() {
        return salary + bonus;
    }

    public void display() {
        super.display();
        System.out.println("Bonus: " + bonus + ", Total Salary: " + totalSalary());
    }
}

public class EmployeeManager3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of managers: ");
        int n = sc.nextInt();

        Manager[] mgr = new Manager[n];
        for (int i = 0; i < n; i++) {
            mgr[i] = new Manager();
            System.out.println("Enter details for Manager " + (i + 1));
            mgr[i].accept(sc);
        }

        Manager max = mgr[0];
        for (int i = 1; i < n; i++) {
            if (mgr[i].totalSalary() > max.totalSalary()) {
                max = mgr[i];
            }
        }

        System.out.println("\nManager with Maximum Total Salary:");
        max.display();

        sc.close();
    }
}
