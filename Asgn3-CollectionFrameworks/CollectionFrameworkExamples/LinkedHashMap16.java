package CollectionFrameworkExamples;
import java.util.*;

public class LinkedHashMap16 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("One", "First");
        lhm.put("Two", "Second");
        System.out.println("LinkedHashMap (Order preserved): " + lhm);
    }
}
