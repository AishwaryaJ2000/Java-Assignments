package CollectionFrameworkExamples;
import java.util.*;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.ensureCapacity(5);
        al.trimToSize();
        System.out.println("ArrayList: " + al);
    }
}
