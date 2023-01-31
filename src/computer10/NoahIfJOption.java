/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computer10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Noah Sitoy
 */
public class NoahIfJOption {
    public static void main(String[] args) throws IOException, ParseException{
        try {
            JSONObject i = (JSONObject) new JSONParser().parse(new FileReader("config/sections.json"));
            while (true) {
                String output = JOptionPane.showInputDialog("Enter a number");
                var x = i.get(output);
                if ("0".equals(output)) {
                    JOptionPane.showMessageDialog(null, "Exiting Program");
                    System.exit(0);
                } else if (null == (String) x) {
                    JOptionPane.showMessageDialog(null, "Section not found");
                } else {
                    JOptionPane.showMessageDialog(null, (String) x);
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: config/sections.json not found!");
        }
    }
}
