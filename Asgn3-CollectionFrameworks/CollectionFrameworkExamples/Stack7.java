package CollectionFrameworkExamples;
import java.util.*;

public class Stack7 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is Empty: " + stack.empty());
    }
}
