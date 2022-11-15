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
public class NameInput {
    public static void main(String[] args) {
        Scanner _input1 = new Scanner(System.in);
        System.out.println("Enter Username:");
        
        String userName = _input1.nextLine();
        
        if ("noah".equals(userName.toLowerCase())){
            System.out.println("Hello Noah! hahahha you are the creator of this Code!");
        }
        else if (!"Noah".equals(userName.toLowerCase())){
            System.out.println("Hello " + userName + " You are not Noah!");
        }
    }
}
