package SwingJLabelsAll;
import javax.swing.*;
import java.awt.*;

public class JPanel3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPanel Example");
        JPanel panel = new JPanel();
        panel.setBackground(Color.PINK);
        panel.add(new JLabel("Hello Aishwarya"));
        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
