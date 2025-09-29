package CollectionFrameworkExamples;
import java.util.*;

public class Vector6 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("One");
        vector.addElement("Two");
        vector.insertElementAt("Zero", 0);
        vector.removeElement("One");
        System.out.println("Vector: " + vector);
    }
}
