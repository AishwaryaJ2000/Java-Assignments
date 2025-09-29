package SwingJLabelsAll;
import javax.swing.*;

public class JMenuBar8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JMenuBar Example");
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem item = new JMenuItem("Open");
        menu.add(item);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
