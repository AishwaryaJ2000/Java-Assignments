package CollectionFrameworkExamples;
import java.util.*;

public interface Set11 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A"); // Duplicate ignored
        System.out.println("Set: " + set);
    }
}
