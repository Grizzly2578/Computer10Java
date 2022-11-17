/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computer10;

import java.util.Scanner;

/**
 *
 * @author Noah Sitoy
 */
public class IF_Sections {
    public static void main (String[] args) {
        while (true) {
            Scanner _input1 = new Scanner(System.in);
            System.out.println("Enter a number");
            String num1 = _input1.nextLine();
            if (num1.equals("1")) {
                System.out.println("7 - Topaz");
            }
            if (num1.equals("2")) {
                System.out.println("7 - Sapphire");
            }
            if (num1.equals("3")) {
                System.out.println("8 - Sardonyx");
            }
            if (num1.equals("4")) {
                System.out.println("8 - Jascint");
            }
            if (num1.equals("5")) {
                System.out.println("9 - Jasper");
            }
            if (num1.equals("6")) {
                System.out.println("9 - Emerald");
            }
            if (num1.equals("7")) {
                System.out.println("10 - Jade");
            }
            if (num1.equals("8")) {
                System.out.println("10 - Amethyst");
            }
            continue;
        }
    }
}
