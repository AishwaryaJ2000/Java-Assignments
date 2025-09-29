package SetB1;
import java.util.Scanner;

class Employee {
	    String name;
	    double salary;

	    public void acceptDetails(Scanner sc) {
	        System.out.print("Enter name: ");
	        name = sc.next();
	        System.out.print("Enter salary: ");
	        salary = sc.nextDouble();
	    }

	    public void displayDetails() {
	        System.out.println("Name: " + name + ", Salary: " + salary);
	    }
	}

	public class Employee2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Employee[] emp = new Employee[5];

	        for (int i = 0; i < emp.length; i++) {
	            emp[i] = new Employee();
	            System.out.println("Enter details for Employee " + (i + 1));
	            emp[i].acceptDetails(sc);
	        }

	        System.out.println("\nEmployee Details:");
	        for (Employee e : emp) {
	            e.displayDetails();
	        }

	        sc.close();
	    }
	}

