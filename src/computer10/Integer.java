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
public class Integer {
    public static void main(String[] args) {
        Scanner _input1 = new Scanner(System.in);
        System.out.println("Your first Number:");
        int num1 = _input1.nextInt();
        Scanner _input2 = new Scanner(System.in);
        System.out.println("Your second Number:");
        int num2 = _input2.nextInt();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double quotient = num1 / num2;
        double product = num1 * num2;
        System.out.println("sum:"+ sum);
        System.out.println("difference:"+ difference);
        System.out.println("quotient:"+ quotient);
        System.out.println("product:" + product);
    }
}
