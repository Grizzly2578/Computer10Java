/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computer10;import java.io.FileNotFoundException;import java.io.FileReader;import java.io.IOException;import java.util.Scanner;import org.json.simple.JSONObject;import org.json.simple.parser.JSONParser;import org.json.simple.parser.ParseException;

/**
 *
 * @author Noah Sitoy
 */
public class Sections {public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {JSONObject my_dict= (JSONObject) new JSONParser().parse(new FileReader("sections.json"));while (true){Scanner _input1 = new Scanner(System.in);System.out.println("Enter a number!");String output = _input1.nextLine();var value = my_dict.get(output);if (null == (String) value){System.out.println("Section not found!");}else {System.out.println((String) value);}continue;}}}