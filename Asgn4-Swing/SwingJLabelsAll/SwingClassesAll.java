package SwingJLabelsAll;
import javax.swing.*;
import java.awt.*;

public class SwingClassesAll extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SwingClassesAll() {
        setTitle("Swing Component Showcase");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabs = new JTabbedPane();

        tabs.addTab("Buttons", createButtonPanel());
        tabs.addTab("Text Fields", createTextPanel());
        tabs.addTab("Lists & Combo", createListComboPanel());
        tabs.addTab("Menus", createMenuPanel());
        tabs.addTab("Dialogs", createDialogPanel());
        tabs.addTab("Misc", createMiscPanel());

        add(tabs);
        setVisible(true);
    }

    private JPanel createButtonPanel() {
        JPanel panel = new JPanel();
        panel.add(new JButton("JButton"));
        panel.add(new JCheckBox("JCheckBox"));
        panel.add(new JRadioButton("JRadioButton"));
        panel.add(new JToggleButton("JToggleButton"));
        return panel;
    }

    private JPanel createTextPanel() {
        JPanel panel = new JPanel(new GridLayout(5, 1));
        panel.add(new JTextField("JTextField"));
        panel.add(new JPasswordField("JPasswordField"));
        panel.add(new JTextArea("JTextArea", 3, 20));
        panel.add(new JFormattedTextField("JFormattedTextField"));
        panel.add(new JTextPane());
        return panel;
    }

    private JPanel createListComboPanel() {
        JPanel panel = new JPanel();
        String[] items = {"Item 1", "Item 2", "Item 3"};
        panel.add(new JComboBox<>(items));
        panel.add(new JList<>(items));
        return panel;
    }

    private JPanel createMenuPanel() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem item = new JMenuItem("Open");
        JCheckBoxMenuItem checkItem = new JCheckBoxMenuItem("Check Me");
        JRadioButtonMenuItem radioItem = new JRadioButtonMenuItem("Radio Option");

        menu.add(item);
        menu.add(checkItem);
        menu.add(radioItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        JPanel panel = new JPanel();
        panel.add(new JLabel("Menu added to JFrame"));
        return panel;
    }

    private JPanel createDialogPanel() {
        JPanel panel = new JPanel();
        JButton showDialog = new JButton("Show JDialog");
        showDialog.addActionListener(_ -> {
            JDialog dialog = new JDialog(this, "JDialog Example", true);
            dialog.setSize(200, 100);
            dialog.add(new JLabel("Hello from JDialog"));
            dialog.setVisible(true);
        });

        JButton showOptionPane = new JButton("Show JOptionPane");
        showOptionPane.addActionListener(_ -> {
            JOptionPane.showMessageDialog(this, "Hello from JOptionPane!");
        });

        panel.add(showDialog);
        panel.add(showOptionPane);
        return panel;
    }

    private JPanel createMiscPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JColorChooser());
        panel.add(new JFileChooser());
        panel.add(new JScrollBar());
        panel.add(new JProgressBar());
        panel.add(new JSlider());
        panel.add(new JSpinner());
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingClassesAll::new);
    }
}
