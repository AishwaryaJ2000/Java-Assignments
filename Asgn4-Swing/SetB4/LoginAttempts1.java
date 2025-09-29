package SetB4;
import javax.swing.*;
import java.awt.*;

public class LoginAttempts1 {
    private static int attempts = 0;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setSize(300, 150);
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

            if (user.equals("admin") && pass.equals("1234")) {
                JOptionPane.showMessageDialog(frame, "Login Successful");
                attempts = 0;
            } else {
                attempts++;
                if (attempts >= 3) {
                    JOptionPane.showMessageDialog(frame, "Login Failed");
                    loginButton.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(frame, "Username or Password is incorrect");
                }
            }
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
