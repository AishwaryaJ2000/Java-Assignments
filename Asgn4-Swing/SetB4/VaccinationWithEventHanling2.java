package SetB4;
import javax.swing.*;
import java.awt.*;

public class VaccinationWithEventHanling2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vaccination Details");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(6, 1));
        JTextField nameField = new JTextField();
        nameField.setBorder(BorderFactory.createTitledBorder("Name"));

        JCheckBox dose1 = new JCheckBox("1st Dose");
        JCheckBox dose2 = new JCheckBox("2nd Dose");

        JRadioButton covishield = new JRadioButton("Covishield");
        JRadioButton covaxin = new JRadioButton("Covaxin");
        JRadioButton sputnik = new JRadioButton("Sputnik V");
        ButtonGroup vaccineGroup = new ButtonGroup();
        vaccineGroup.add(covishield);
        vaccineGroup.add(covaxin);
        vaccineGroup.add(sputnik);

        JButton submitButton = new JButton("Submit");
        JTextArea outputArea = new JTextArea(5, 30);
        outputArea.setEditable(false);
        outputArea.setBorder(BorderFactory.createTitledBorder("Summary"));

        submitButton.addActionListener(_ -> {
            String name = nameField.getText();
            String doseStatus = dose1.isSelected() ? "Yes" : "No";
            String vaccine = covishield.isSelected() ? "Covishield" :
                             covaxin.isSelected() ? "Covaxin" :
                             sputnik.isSelected() ? "Sputnik V" : "None";

            outputArea.setText("Name: " + name + "\n" +
                               "1st Dose: " + doseStatus + "\n" +
                               "Vaccine: " + vaccine);
        });

        panel.add(nameField);
        panel.add(dose1);
        panel.add(dose2);
        panel.add(covishield);
        panel.add(covaxin);
        panel.add(sputnik);
        panel.add(submitButton);
        panel.add(new JScrollPane(outputArea));

        frame.add(panel);
        frame.setVisible(true);
    }
}
