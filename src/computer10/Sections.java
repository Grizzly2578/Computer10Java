//Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template. @author Noah Sitoy
package computer10;import java.io.FileNotFoundException;import java.io.FileReader;import java.io.IOException;import java.util.Scanner;import org.json.simple.JSONObject;import org.json.simple.parser.JSONParser;import org.json.simple.parser.ParseException;public class Sections{public static void main(String[]args)throws FileNotFoundException,IOException,ParseException{JSONObject i=(JSONObject)new JSONParser().parse(new FileReader("sections.json"));while(true){var _input1=new Scanner(System.in);System.out.println("Enter a number!");var x=i.get(_input1.nextLine());if (null==(String)x){System.out.println("Section not found!");}else{System.out.println((String) x);}}}}