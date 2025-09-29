package SwingJLabelsAll;
import javax.swing.*;

public class JTextFieldJTextArea4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField & JTextArea");
        JTextField textField = new JTextField("Type here", 15);
        JTextArea textArea = new JTextArea("Multiline text", 5, 15);
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(new JScrollPane(textArea));
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
