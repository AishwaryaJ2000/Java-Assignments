package SwingJLabelsAll;
import javax.swing.*;

public class JScrollBar10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JScrollBar Example");
        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 100);
        frame.add(scrollBar);
        frame.setSize(300, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
