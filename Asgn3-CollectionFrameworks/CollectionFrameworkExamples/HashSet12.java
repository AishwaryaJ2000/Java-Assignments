package CollectionFrameworkExamples;
import java.util.*;

public class HashSet12 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.remove(2);
        System.out.println("HashSet: " + hs);
    }
}
