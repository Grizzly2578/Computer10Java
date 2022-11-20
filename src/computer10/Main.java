/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computer10;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Noah Sitoy
 */
public class Main {
    public static void main(String[] argss) throws IOException, FileNotFoundException, ParseException{
        Scanner _input1 = new Scanner(System.in);
        System.out.println("Welcome to my Computer 10 repository!\nChoose a program:\n  1 : Name Input\n  2 : Integer Operations\n  3 : Sections Picker using IF Statement\n  4 : Sections Picker using JSON");
        switch (_input1.nextLine()) {
            case "1" -> NameInput.main(argss);
            case "2" -> Integer_Operations.main(argss);
            case "3" -> IF_Sections.main(argss);
            case "4" -> Sections.main(argss);
            default -> System.out.println("Invalid Choice!");
        }
    }
}
