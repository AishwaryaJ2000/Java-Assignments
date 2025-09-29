package SetA3;
import java.util.*;


public class UniqueIntegers1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new TreeSet<>();

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt()); // TreeSet avoids duplicates and sorts automatically
        }

        System.out.println("Sorted Unique Numbers: " + numbers);

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();
        if (numbers.contains(search)) {
            System.out.println(search + " is present in the collection.");
        } else {
            System.out.println(search + " is NOT present.");
        }

        sc.close();
    }
}
