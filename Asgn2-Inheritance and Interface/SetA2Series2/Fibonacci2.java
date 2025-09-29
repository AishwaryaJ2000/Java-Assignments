package SetA2Series2;

public class Fibonacci2 {
 public void printSeries(int n) {
     int a = 0, b = 1;
     System.out.print("Fibonacci: ");
     for (int i = 0; i < n; i++) {
         System.out.print(a + " ");
         int c = a + b;
         a = b;
         b = c;
     }
     System.out.println();
 }
}

