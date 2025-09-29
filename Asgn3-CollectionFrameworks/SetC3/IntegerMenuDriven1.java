package SetC3;
	import java.io.*;
	import java.util.*;

public class IntegerMenuDriven1 {
	    public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);
	        Set<Integer> numbers = new LinkedHashSet<>();
	        Random rand = new Random();
	        int choice;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Load (Generate 10 random 2-digit numbers)");
	            System.out.println("2. Save to file (number.txt)");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    numbers.clear();
	                    while (numbers.size() < 10) {
	                        numbers.add(rand.nextInt(90) + 10); // 10 to 99
	                    }
	                    System.out.println("Generated Numbers: " + numbers);
	                    break;

	                case 2:
	                    BufferedWriter bw = new BufferedWriter(new FileWriter("number.txt"));
	                    for (int num : numbers) {
	                        bw.write(num + "\n");
	                    }
	                    bw.close();
	                    System.out.println("Numbers saved to number.txt");
	                    break;

	                case 3:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } while (choice != 3);

	        sc.close();
	    }
	}


