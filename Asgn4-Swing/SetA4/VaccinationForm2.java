package SetA4;
import javax.swing.*;
import java.awt.*;

public class VaccinationForm2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vaccination Details");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(5, 1));

        JTextField nameField = new JTextField();
        nameField.setBorder(BorderFactory.createTitledBorder("Name"));

        JPanel dosePanel = new JPanel();
        dosePanel.setBorder(BorderFactory.createTitledBorder("Dose"));
        JCheckBox dose1 = new JCheckBox("1st Dose");
        JCheckBox dose2 = new JCheckBox("2nd Dose");
        dosePanel.add(dose1);
        dosePanel.add(dose2);

        JPanel vaccinePanel = new JPanel();
        vaccinePanel.setBorder(BorderFactory.createTitledBorder("Vaccine"));
        JRadioButton covishield = new JRadioButton("Covishield");
        JRadioButton covaxin = new JRadioButton("Covaxin");
        JRadioButton sputnik = new JRadioButton("Sputnik V");
        ButtonGroup vaccineGroup = new ButtonGroup();
        vaccineGroup.add(covishield);
        vaccineGroup.add(covaxin);
        vaccineGroup.add(sputnik);
        vaccinePanel.add(covishield);
        vaccinePanel.add(covaxin);
        vaccinePanel.add(sputnik);

        JButton submitButton = new JButton("Submit");

        JTextArea outputArea = new JTextArea(5, 30);
        outputArea.setBorder(BorderFactory.createTitledBorder("Summary"));
        outputArea.setEditable(false);

        submitButton.addActionListener(_ -> {
            String name = nameField.getText();
            String doseStatus = "";
            if (dose1.isSelected()) doseStatus += "1st Dose ";
            if (dose2.isSelected()) doseStatus += "2nd Dose ";

            String vaccine = covishield.isSelected() ? "Covishield" :
                             covaxin.isSelected() ? "Covaxin" :
                             sputnik.isSelected() ? "Sputnik V" : "None";

            outputArea.setText("Name: " + name + "\n" +
                               "Dose: " + doseStatus + "\n" +
                               "Vaccine: " + vaccine);
        });

        inputPanel.add(nameField);
        inputPanel.add(dosePanel);
        inputPanel.add(vaccinePanel);
        inputPanel.add(submitButton);
        inputPanel.add(new JScrollPane(outputArea));

        frame.add(inputPanel);
        frame.setVisible(true);
    }
}
