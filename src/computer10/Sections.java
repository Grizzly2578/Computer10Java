/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computer10;

import java.util.Scanner;
import org.json.simple.JSONObject;
/**
 *
 * @author Noah Sitoy
 */
public class Sections {
    public static void main(String[] args) {
        JSONObject my_dict = new JSONObject();
        my_dict.put("1", "Topaz");
        my_dict.put("2", "Sapphire");
        my_dict.put("3", "Sardonyx");
        my_dict.put("4", "Jascint");
        my_dict.put("5", "Emerald");
        my_dict.put("6", "Jasper");
        my_dict.put("7", "Amethyst");
        my_dict.put("8", "Jade");
        while (true){
            Scanner _input1 = new Scanner(System.in);
            System.out.println("Enter a number!");
            String num1 = _input1.nextLine();
             my_dict.get(num1);
            System.out.println(num1);
            break;
            
        }
    }
}
