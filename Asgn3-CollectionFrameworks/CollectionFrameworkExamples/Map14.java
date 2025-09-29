package CollectionFrameworkExamples;
import java.util.*;

public interface Map14 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Aishu", 1);
        map.put("Buddy", 2);
        System.out.println("Get: " + map.get("Aishu"));
        map.remove("Buddy");
        System.out.println("Map: " + map);
    }
}
