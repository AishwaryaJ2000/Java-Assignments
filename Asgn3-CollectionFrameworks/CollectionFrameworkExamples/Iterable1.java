package CollectionFrameworkExamples;
import java.util.*;

public interface Iterable1 {
    public static void main(String[] args) {
        Iterable<String> iterable = Arrays.asList("Aishu", "Buddy", "Java");

        for (String item : iterable) {
            System.out.println("For-each: " + item);
        }

        Iterator<String> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator: " + iterator.next());
        }
    }
}

