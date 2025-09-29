package SwingJLabelsAll;
import javax.swing.*;
import java.awt.*;

public class SwingAllOne {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Aishu's Elderly Care Platform");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel welcomeLabel = new JLabel("Welcome, Volunteer!", JLabel.CENTER);
        welcomeLabel.setFont(new Font("Serif", Font.BOLD, 18));
        panel.add(welcomeLabel);

        JTextField nameField = new JTextField();
        nameField.setBorder(BorderFactory.createTitledBorder("Your Name"));
        panel.add(nameField);

        JComboBox<String> homeSelector = new JComboBox<>(new String[] {
            "Matoshree Old Age Home", "Anand Dham", "Shraddha Sadan"
        });
        homeSelector.setBorder(BorderFactory.createTitledBorder("Select Old Age Home"));
        panel.add(homeSelector);

        JTextArea messageArea = new JTextArea(3, 20);
        messageArea.setBorder(BorderFactory.createTitledBorder("Message to Elders"));
        panel.add(new JScrollPane(messageArea));

        JButton submitButton = new JButton("Send Message");
        panel.add(submitButton);

        submitButton.addActionListener(_ -> {
            String name = nameField.getText().trim();
            String home = (String) homeSelector.getSelectedItem();
            String message = messageArea.getText().trim();

            if (name.isEmpty() || message.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Incomplete", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame,
                    "Thank you, " + name + "!\nYour message has been sent to " + home + ".",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
