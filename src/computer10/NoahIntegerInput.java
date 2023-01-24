package computer10;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class NoahIntegerInput {
    public static String format_double(String[] args, double _double) throws NumberFormatException {
        String d = Double.toString(_double);

        if(d.endsWith(".0")){
            return d.substring(0, d.length() - 2);
        }
        return d;
    }
    public static void main(String[] args) throws NumberFormatException {
        try {
            double num1, num2, sum, difference, product, quotient;
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter a number"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the next number"));
            sum = num1 + num2;
            difference = num1 - num2;
            product = num1 * num2;
            quotient = num1 / num2;
            JOptionPane.showMessageDialog(null, "The sum is " + format_double(args, sum) + "\n The difference is " + format_double(args, difference) + "\nThe product is " + format_double(args, product) + "\nThe quotioent is " + format_double(args, quotient)
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Your input must be a number!");
        }
    }
}
