package SetB2;
import java.util.*;

abstract class Staff {
    String name, address;

    public Staff(String name, String address) {
        this.name = name;
        this.address = address;
    }

    abstract double calculateSalary();

    public abstract void display();
}

class FullTimeStaff extends Staff {
    String department;
    double salary;

    public FullTimeStaff(String name, String address, String department, double salary) {
        super(name, address);
        this.department = department;
        this.salary = salary;
    }

    public double calculateSalary() {
        double hra = 0.08 * salary;
        double da = 0.05 * salary;
        return salary + hra + da;
    }

    public void display() {
        System.out.println("FullTimeStaff: " + name + ", Dept: " + department + ", Salary: " + calculateSalary());
    }
}

class PartTimeStaff extends Staff {
    int hours;
    double rate;

    public PartTimeStaff(String name, String address, int hours, double rate) {
        super(name, address);
        this.hours = hours;
        this.rate = rate;
    }

    public double calculateSalary() {
        return hours * rate;
    }

    public void display() {
        System.out.println("PartTimeStaff: " + name + ", Hours: " + hours + ", Salary: " + calculateSalary());
    }
}

public class Staff3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of staff members: ");
        int n = sc.nextInt();

        Staff[] staffList = new Staff[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (1 for FullTime, 2 for PartTime): ");
            int type = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter address: ");
            String address = sc.nextLine();

            if (type == 1) {
                System.out.print("Enter department: ");
                String dept = sc.nextLine();
                System.out.print("Enter salary: ");
                double sal = sc.nextDouble();
                staffList[i] = new FullTimeStaff(name, address, dept, sal);
            } else {
                System.out.print("Enter number of hours: ");
                int hrs = sc.nextInt();
                System.out.print("Enter rate per hour: ");
                double rate = sc.nextDouble();
                staffList[i] = new PartTimeStaff(name, address, hrs, rate);
            }
        }

        System.out.println("\n--- Full Time Staff ---");
        for (Staff s : staffList) {
            if (s instanceof FullTimeStaff) s.display();
        }

        System.out.println("\n--- Part Time Staff ---");
        for (Staff s : staffList) {
            if (s instanceof PartTimeStaff) s.display();
        }

        sc.close();
    }
}
