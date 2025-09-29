package SwingJLabelsAll;
import javax.swing.*;

public class JButton11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JButton Example");
        JButton button = new JButton("Click Me");
        button.addActionListener(_ -> JOptionPane.showMessageDialog(frame, "Button Clicked!"));
        frame.add(button);
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
