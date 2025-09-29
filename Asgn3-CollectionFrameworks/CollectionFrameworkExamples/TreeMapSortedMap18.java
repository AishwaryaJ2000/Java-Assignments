package CollectionFrameworkExamples;
import java.util.*;

public class TreeMapSortedMap18 {
    public static void main(String[] args) {
        SortedMap<String, Integer> sm = new TreeMap<>();
        sm.put("Z", 10);
        sm.put("A", 5);
        sm.put("M", 7);
        System.out.println("TreeMap (Sorted): " + sm);
    }
}
