package SetA4;
import javax.swing.*;
import java.awt.*;

public class LanguageSelector4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combobox Example");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Programming Language:");
        String[] languages = {"Java", "C", "C++", "PHP", ".Net"};
        JComboBox<String> comboBox = new JComboBox<>(languages);
        JButton showButton = new JButton("Show");
        JLabel resultLabel = new JLabel("Selected: ");

        showButton.addActionListener(_ -> {
            String selected = (String) comboBox.getSelectedItem();
            resultLabel.setText("Selected: " + selected);
        });

        JPanel panel = new JPanel(new GridLayout(4, 1, 5, 5));
        panel.add(label);
        panel.add(comboBox);
        panel.add(showButton);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setVisible(true);
    }
}
