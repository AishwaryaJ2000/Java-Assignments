package CollectionFrameworkExamples;
import java.util.*;

public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("First");
        ll.addLast("Last");
        ll.addFirst("New First");
        ll.removeLast();
        ll.removeFirst();
        System.out.println("LinkedList: " + ll);
    }
}
