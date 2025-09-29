package SetA4;
import javax.swing.*;
import java.awt.*;

public class CountWords3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Count words and characters");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea(5, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JButton countButton = new JButton("Count Words");
        JLabel resultLabel = new JLabel("Words: 0 Characters: 0");

        countButton.addActionListener(_ -> {
            String text = textArea.getText().trim();
            int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;
            int charCount = text.length();
            resultLabel.setText("Words: " + wordCount + " Characters: " + charCount);
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(countButton, BorderLayout.SOUTH);
        panel.add(resultLabel, BorderLayout.NORTH);

        frame.add(panel);
        frame.setVisible(true);
    }
}
