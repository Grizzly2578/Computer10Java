/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computer10;

import java.util.Scanner;

/**
 *
 * @author Noah Sitoy
 * @section Amethyst
 * @grade 10
 */
public class Integer {
    public static void main(String[] args) {
        Scanner _input1 = new Scanner(System.in);
        System.out.println("Your first Number:");
        int num1 = _input1.nextInt(); // Variable for the first number!
        Scanner _input2 = new Scanner(System.in);
        System.out.println("Your second Number:");
        int num2 = _input2.nextInt(); // Variable for the second number!
        double sum = num1 + num2; // Variable for the sum of the numbers!
        double difference = num1 - num2; // Variable for the difference of the numbers!
        double quotient = num1 / num2; // Variable for the quotient of the numbers!
        double product = num1 * num2; // Variable for the product of the numbers!
        _input1.close(); // Closed the inputstream to avoid resource leaks!
        _input2.close(); // Closed the inputstream to avoid resource leaks!
        System.out.println("sum:"+ sum); // Display the output output of the sum
        System.out.println("difference:"+ difference); // Display the output output of the differnce!
        System.out.println("quotient:"+ quotient); // Display the output output of the quotient!
        System.out.println("product:" + product); // Display the output output of the product!
    }
}
