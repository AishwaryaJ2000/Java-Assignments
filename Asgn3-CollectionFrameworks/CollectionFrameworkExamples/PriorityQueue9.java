package CollectionFrameworkExamples;
import java.util.*;

public class PriorityQueue9 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("Poll: " + pq.poll());
        System.out.println("Peek: " + pq.peek());
        System.out.println("PriorityQueue: " + pq);
    }
}
