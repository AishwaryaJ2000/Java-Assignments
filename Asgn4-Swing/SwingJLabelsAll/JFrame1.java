package SwingJLabelsAll;
import javax.swing.*;

public class JFrame1 {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Welcome to Swing");

        // Set size of the window
        frame.setSize(400, 300);

        // Set default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a label to the frame
        JLabel label = new JLabel("Hello, Aishu!", JLabel.CENTER);
        frame.add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
