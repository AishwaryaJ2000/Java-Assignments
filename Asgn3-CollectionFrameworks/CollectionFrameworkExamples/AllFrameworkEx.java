package CollectionFrameworkExamples;
import java.util.*;

public class AllFrameworkEx {
    public static void main(String[] args) {

        // 🌱 Iterable
        System.out.println("=== Iterable ===");
        Iterable<String> iterable = Arrays.asList("Aishu", "Buddy", "Java");
        for (String item : iterable) {
            System.out.println("Item: " + item);
        }

        // 📦 Collection
        System.out.println("\n=== Collection ===");
        Collection<String> collection = new ArrayList<>();
        collection.add("One");
        collection.add("Two");
        collection.addAll(Arrays.asList("Three", "Four"));
        System.out.println("Collection: " + collection);
        collection.remove("One");
        collection.clear();
        System.out.println("Is Empty? " + collection.isEmpty());

        // 📋 List Interface
        System.out.println("\n=== List ===");
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add(1, "B");
        list.set(0, "Updated");
        System.out.println("Get index 1: " + list.get(1));
        list.remove(1);
        System.out.println("Index of 'Updated': " + list.indexOf("Updated"));
        System.out.println("Sublist: " + list.subList(0, 1));

        // 🧮 ArrayList
        System.out.println("\n=== ArrayList ===");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.ensureCapacity(5);
        al.trimToSize();
        System.out.println("ArrayList: " + al);

        // 🔗 LinkedList
        System.out.println("\n=== LinkedList ===");
        LinkedList<String> ll = new LinkedList<>();
        ll.add("First");
        ll.addLast("Last");
        ll.addFirst("New First");
        ll.removeLast();
        ll.removeFirst();
        System.out.println("LinkedList: " + ll);

        // 📦 Vector
        System.out.println("\n=== Vector ===");
        Vector<String> vector = new Vector<>();
        vector.add("One");
        vector.addElement("Two");
        vector.insertElementAt("Zero", 0);
        vector.removeElement("One");
        System.out.println("Vector: " + vector);

        // 🧱 Stack
        System.out.println("\n=== Stack ===");
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty? " + stack.empty());

        // 🧵 Queue
        System.out.println("\n=== Queue ===");
        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        queue.offer("Two");
        System.out.println("Peek: " + queue.peek());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Queue: " + queue);

        // 🌀 PriorityQueue
        System.out.println("\n=== PriorityQueue ===");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("Poll: " + pq.poll());
        System.out.println("Peek: " + pq.peek());
        System.out.println("PriorityQueue: " + pq);

        // 🔁 Deque / ArrayDeque
        System.out.println("\n=== ArrayDeque ===");
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Back");
        deque.offerFirst("New Front");
        deque.offerLast("New Back");
        System.out.println("Remove First: " + deque.removeFirst());
        System.out.println("Remove Last: " + deque.removeLast());

        // 🧩 Set
        System.out.println("\n=== Set ===");
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A"); // Duplicate ignored
        System.out.println("Set: " + set);

        // 🧮 HashSet
        System.out.println("\n=== HashSet ===");
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.remove(2);
        System.out.println("HashSet: " + hs);

        // 🌳 SortedSet / TreeSet
        System.out.println("\n=== TreeSet ===");
        SortedSet<String> ts = new TreeSet<>();
        ts.add("Z");
        ts.add("A");
        ts.add("M");
        System.out.println("TreeSet (Sorted): " + ts);

        // 🗺️ Map
        System.out.println("\n=== Map ===");
        Map<String, Integer> map = new HashMap<>();
        map.put("Aishu", 1);
        map.put("Buddy", 2);
        System.out.println("Get: " + map.get("Aishu"));
        map.remove("Buddy");
        System.out.println("Map: " + map);

        // 🧮 HashMap
        System.out.println("\n=== HashMap ===");
        HashMap<String, String> hm = new HashMap<>();
        hm.put("One", "First");
        hm.put("Two", "Second");
        System.out.println("Contains Key 'One'? " + hm.containsKey("One"));
        System.out.println("HashMap: " + hm);

        // 🔗 LinkedHashMap
        System.out.println("\n=== LinkedHashMap ===");
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("One", "First");
        lhm.put("Two", "Second");
        System.out.println("LinkedHashMap (Order preserved): " + lhm);

        // 🧱 Hashtable
        System.out.println("\n=== Hashtable ===");
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("Key1", "Value1");
        ht.put("Key2", "Value2");
        System.out.println("Hashtable: " + ht);

        // 🌳 SortedMap / TreeMap
        System.out.println("\n=== TreeMap ===");
        SortedMap<String, Integer> sm = new TreeMap<>();
        sm.put("Z", 10);
        sm.put("A", 5);
        sm.put("M", 7);
        System.out.println("TreeMap (Sorted): " + sm);
    }
}
