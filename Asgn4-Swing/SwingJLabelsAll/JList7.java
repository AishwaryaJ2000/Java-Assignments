package SwingJLabelsAll;
import javax.swing.*;

public class JList7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JList<String> list = new JList<>(items);
        frame.add(new JScrollPane(list));
        frame.setSize(200, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
