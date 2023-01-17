package computer10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sections {

    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        JSONObject i = (JSONObject) new JSONParser().parse(new FileReader("config/sections.json"));
        while (true) {
            var _input1 = new Scanner(System.in);
            System.out.println("Enter a number!");
            String output = _input1.nextLine();
            var x = i.get(output);
            if ("0".equals(output)) {
                System.exit(0);
            } else if (null == (String) x) {
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println("Section not found!");
            }
            else {
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                System.out.println((String) x);
            }
        }
    }
}
