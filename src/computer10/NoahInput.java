package computer10;
import javax.swing.JOptionPane;

public class NoahInput {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello " + name+".");
    }

}
