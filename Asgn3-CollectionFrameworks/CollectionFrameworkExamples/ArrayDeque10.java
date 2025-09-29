package CollectionFrameworkExamples;
import java.util.*;

public class ArrayDeque10 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        deque.offerFirst("New Front");
        deque.offerLast("New Back");
        System.out.println("Remove First: " + deque.removeFirst());
        System.out.println("Remove Last: " + deque.removeLast());
    }
}
