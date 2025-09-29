package CollectionFrameworkExamples;
import java.util.*;

//🌱 Custom Iterable Implementation
class MyIterable implements Iterable<String> {
 List<String> data = Arrays.asList("Aishu", "Buddy", "Java");

 public Iterator<String> iterator() {
     return data.iterator();
 }
}

//📦 Custom Collection Implementation
class MyCollection extends AbstractCollection<String> {
 List<String> items = new ArrayList<>();

 public boolean add(String item) {
     return items.add(item);
 }

 public Iterator<String> iterator() {
     return items.iterator();
 }

 public int size() {
     return items.size();
 }
}

//📋 Custom List Implementation
class MyList extends AbstractList<String> {
 List<String> list = new ArrayList<>();

 public String get(int index) {
     return list.get(index);
 }

 public int size() {
     return list.size();
 }

 public String set(int index, String element) {
     return list.set(index, element);
 }

 public void add(int index, String element) {
     list.add(index, element);
 }

 public String remove(int index) {
     return list.remove(index);
 }
}

//🧩 Custom Set Implementation
class MySet extends AbstractSet<String> {
 Set<String> set = new HashSet<>();

 public Iterator<String> iterator() {
     return set.iterator();
 }

 public int size() {
     return set.size();
 }

 public boolean add(String item) {
     return set.add(item);
 }
}

//🧵 Custom Queue Implementation
class MyQueue extends LinkedList<String> implements Queue<String> {
 // LinkedList already implements Queue
}

//🗺️ Custom Map Implementation
class MyMap extends AbstractMap<String, Integer> {
 Map<String, Integer> map = new HashMap<>();

 public Set<Entry<String, Integer>> entrySet() {
     return map.entrySet();
 }

 public Integer put(String key, Integer value) {
     return map.put(key, value);
 }
}

//🌳 Custom SortedMap Implementation
class MySortedMap extends TreeMap<String, Integer> implements SortedMap<String, Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 // TreeMap already implements SortedMap
}


public class AllFrameworkEx2 {
 public static void main(String[] args) {

     // 🌱 Iterable
     System.out.println("=== Iterable ===");
     MyIterable mi = new MyIterable();
     for (String s : mi) {
         System.out.println(s);
     }

     // 📦 Collection
     System.out.println("\n=== Collection ===");
     MyCollection mc = new MyCollection();
     mc.add("One");
     mc.add("Two");
     System.out.println("Collection size: " + mc.size());

     // 📋 List
     System.out.println("\n=== List ===");
     MyList ml = new MyList();
     ml.add(0, "First");
     ml.add(1, "Second");
     ml.set(1, "Updated");
     System.out.println("List item: " + ml.get(1));
     ml.remove(0);
     System.out.println("List size: " + ml.size());

     // 🧩 Set
     System.out.println("\n=== Set ===");
     MySet ms = new MySet();
     ms.add("A");
     ms.add("B");
     ms.add("A"); // Duplicate ignored
     System.out.println("Set size: " + ms.size());

     // 🧵 Queue
     System.out.println("\n=== Queue ===");
     MyQueue mq = new MyQueue();
     mq.add("One");
     mq.offer("Two");
     System.out.println("Queue poll: " + mq.poll());

     // 🗺️ Map
     System.out.println("\n=== Map ===");
     MyMap mm = new MyMap();
     mm.put("Aishu", 1);
     mm.put("Buddy", 2);
     for (Map.Entry<String, Integer> entry : mm.entrySet()) {
         System.out.println(entry.getKey() + ": " + entry.getValue());
     }

     // 🌳 SortedMap
     System.out.println("\n=== SortedMap ===");
     MySortedMap msm = new MySortedMap();
     msm.put("Z", 10);
     msm.put("A", 5);
     msm.put("M", 7);
     System.out.println("SortedMap: " + msm);
 }
}
