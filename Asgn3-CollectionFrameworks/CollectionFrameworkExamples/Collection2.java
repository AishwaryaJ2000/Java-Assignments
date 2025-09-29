package CollectionFrameworkExamples;
import java.util.*;

public interface Collection2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("One");
        collection.add("Two");
        collection.addAll(Arrays.asList("Three", "Four"));
        System.out.println("Size: " + collection.size());
        System.out.println("Contains 'Two' : " + collection.contains("Two"));
        collection.remove("One");
        collection.removeAll(Arrays.asList("Three", "Four"));
        collection.clear();
        System.out.println("Is Empty: " + collection.isEmpty());
    }
}
