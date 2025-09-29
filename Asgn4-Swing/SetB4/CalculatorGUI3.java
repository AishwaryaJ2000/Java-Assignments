package SetB4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI3 extends JFrame implements ActionListener {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextField display;
    private StringBuilder input = new StringBuilder();

    public CalculatorGUI3() {
        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Display field
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        // Button panel
        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            ".", "0", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        // Clear button
        JButton clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Arial", Font.BOLD, 18));
        clearButton.addActionListener(_ -> {
            input.setLength(0);
            display.setText("");
        });

        // Layout setup
        setLayout(new BorderLayout(10, 10));
        add(display, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(clearButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.equals("=")) {
            try {
                String result = String.valueOf(eval(input.toString()));
                display.setText(result);
                input.setLength(0);
                input.append(result);
            } catch (Exception ex) {
                display.setText("Error");
                input.setLength(0);
            }
        } else {
            input.append(cmd);
            display.setText(input.toString());
        }
    }

    // Expression evaluator using JavaScript engine
    public double eval(String expr) throws Exception {
        return ((Number) new javax.script.ScriptEngineManager()
            .getEngineByName("JavaScript")
            .eval(expr)).doubleValue();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CalculatorGUI3::new);
    }
}
