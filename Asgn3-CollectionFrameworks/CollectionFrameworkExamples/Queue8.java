package CollectionFrameworkExamples;
import java.util.*;

public interface Queue8 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        queue.offer("Two");
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Queue: " + queue);
    }
}
