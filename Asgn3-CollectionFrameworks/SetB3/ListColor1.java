package SetB3;
import java.util.*;


public class ListColor1 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("orange");

        System.out.println("Original List:");
        Iterator<String> it = colors.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\n\nList in Reverse Order:");
        ListIterator<String> listIt = colors.listIterator(colors.size());
        while (listIt.hasPrevious()) {
            System.out.print(listIt.previous() + " ");
        }

        LinkedList<String> newColors = new LinkedList<>();
        newColors.add("pink");
        newColors.add("green");

        int index = colors.indexOf("yellow");
        colors.addAll(index, newColors);

        System.out.println("\n\nUpdated List After Insertion:");
        for (String color : colors) {
            System.out.print(color + " ");
        }
    }
}
