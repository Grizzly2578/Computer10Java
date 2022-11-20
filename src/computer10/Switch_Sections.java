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
public class Switch_Sections{
    public static void main(String[]args){
        while(true){
            Scanner _input1=new Scanner(System.in);
            System.out.println("Enter a number");
            String num1=_input1.nextLine();
            switch(num1){
                case"1"->System.out.println("7 - Topaz");
                case"2"->System.out.println("7 - Sapphire");
                case"3"->System.out.println("8 - Sardonyx");
                case"4"->System.out.println("8 - Jascint");
                case"5"-> System.out.println("9 - Jasper");
                case"6"-> System.out.println("9 - Emerald");
                case"7"-> System.out.println("10 - Jade");
                case"8"-> System.out.println("10 - Amethyst");
                default->{
                }
            }
        }
    }
}
