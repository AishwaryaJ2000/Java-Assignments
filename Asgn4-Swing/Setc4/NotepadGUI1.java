package Setc4;
import javax.swing.*;

public class NotepadGUI1 extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JTextArea textArea;

    public NotepadGUI1() {
        setTitle("Notepad");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Text area with scroll pane
        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Menu bar
        JMenuBar menuBar = new JMenuBar();

        // File menu (empty for now)
        JMenu fileMenu = new JMenu("File");

        // Edit menu
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        JMenuItem selectAllItem = new JMenuItem("Select All");

        cutItem.addActionListener(_ -> textArea.cut());
        copyItem.addActionListener(_ -> textArea.copy());
        pasteItem.addActionListener(_ -> textArea.paste());
        selectAllItem.addActionListener(_ -> textArea.selectAll());

        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(selectAllItem);

        // Help menu (empty for now)
        JMenu helpMenu = new JMenu("Help");

        // Add menus to menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // Set layout and add components
        setJMenuBar(menuBar);
        add(scrollPane);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(NotepadGUI1::new);
    }
}
