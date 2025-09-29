package CollectionFrameworkExamples;
import java.util.*;

public interface List3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add(1, "B");
        list.set(0, "Updated");
        System.out.println("Get index 1: " + list.get(1));
        list.remove(1);
        System.out.println("Index of 'Updated': " + list.indexOf("Updated"));
        System.out.println("Sublist: " + list.subList(0, 1));
    }
}
