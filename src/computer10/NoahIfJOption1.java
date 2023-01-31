/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computer10;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Noah Sitoy
 */
public class NoahIfJOption1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        while (true) {
            int num1 =  Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            switch (num1) {
                case 0 ->{
                    JOptionPane.showMessageDialog(null, "Exiting Program");
                }
                case 1 ->{
                    JOptionPane.showMessageDialog(null,"Topaz");
                }
                case 2 ->{
                    JOptionPane.showMessageDialog(null,"7 - Sapphire");
                }
                case 3 ->{
                    JOptionPane.showMessageDialog(null,"Sardonyx");
                }
                case 4 ->{
                    JOptionPane.showMessageDialog(null,"8 - Jascint");
                }
                case 5 ->{
                    JOptionPane.showMessageDialog(null,"Jasper");
                }
                case 6 ->{
                    JOptionPane.showMessageDialog(null,"9 - Emerald");
                }
                case 7 ->{
                    JOptionPane.showMessageDialog(null,"Jade");
                }
                case 8 ->{
                    JOptionPane.showMessageDialog(null,"10 - Amethyst");
                }
                case 9 ->{
                    JOptionPane.showMessageDialog(null,"Beryl");
                }
                case 10 ->{
                    JOptionPane.showMessageDialog(null,"11 - Crysolite");
                }
                case 11 ->{
                    JOptionPane.showMessageDialog(null,"Ruby");
                }
                case 12 ->{
                    JOptionPane.showMessageDialog(null,"12 - Chalcedony");
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Section not found");
                }
            }
        }
    }
}
