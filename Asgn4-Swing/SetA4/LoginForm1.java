package SetA4;
import javax.swing.*;
import java.awt.*;

public class LoginForm1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setSize(500,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JButton resetButton = new JButton("Reset");

        loginButton.addActionListener(_ -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            JOptionPane.showMessageDialog(frame, "Username: " + user + "\nPassword: " + pass);
        });

        resetButton.addActionListener(_ -> {
            userField.setText("");
            passField.setText("");
        });

        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginButton);
        panel.add(resetButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
