package SetA3;
import java.util.*;


public class EmployeeHashtable2 {
    public static void main(String[] args) {
        Hashtable<String, Double> empTable = new Hashtable<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            empTable.put(name, salary);
        }

        System.out.println("\nEmployee Details:");
        for (Map.Entry<String, Double> entry : empTable.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Salary: ₹" + entry.getValue());
        }

        System.out.print("\nSearch Employee Name: ");
        String searchName = sc.next();
        if (empTable.containsKey(searchName)) {
            System.out.println("Salary of " + searchName + ": ₹" + empTable.get(searchName));
        } else {
            System.out.println("Employee not found.");
        }

        sc.close();
    }
}
