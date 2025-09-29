package CollectionFrameworkExamples;
import java.util.*;

public class HashMap15 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("One", "First");
        hm.put("Two", "Second");
        System.out.println("Contains Key 'One': " + hm.containsKey("One"));
        System.out.println("HashMap: " + hm);
    }
}
