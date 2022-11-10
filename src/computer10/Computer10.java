/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computer10;
import java.util.Scanner;

/**
 *
 * @author Noah Sitoy
 */
public class Computer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner _input1 = new Scanner(System.in);
        System.out.println("Enter Username:");
        
        String userName = _input1.nextLine().toLowerCase();
        
        if ("noah".equals(userName)){
            System.out.println("Hello Noah! hahahha");
        }
        else if (!"Noah".equals(userName)){
            System.out.println("Hello " + userName + " You are not Noah!");
        }
    }
    }