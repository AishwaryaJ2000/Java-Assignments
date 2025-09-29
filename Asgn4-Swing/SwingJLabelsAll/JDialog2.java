package SwingJLabelsAll;
import javax.swing.*;

public class JDialog2 {
    public static void main(String[] args) {
        JFrame parent = new JFrame();
        JDialog dialog = new JDialog(parent, "JDialog ", true);
        dialog.setSize(200, 100);
        dialog.setVisible(true);
    }
}
