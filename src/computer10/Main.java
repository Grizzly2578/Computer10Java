package computer10;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import org.json.simple.parser.ParseException;

public class Main {

    public static void main(String[] argss) throws IOException, FileNotFoundException, ParseException, InterruptedException {
        System.out.println("Hello You Are My World!\n");
        Scanner _input1 = new Scanner(System.in);
        System.out.println("Welcome to my Computer 10 repository!\nIf you enter 0 on most of my programs it will exit!\nChoose a program:\n  1 : Name Input\n  2 : Integer Operations\n  3 : Sections Picker using Switch Statements\n  4 : Sections Picker using JSON\n  5 : Numbers Input Box");
        File dir = new File("config");
        if (!dir.exists()) {
            dir.mkdir();
        }
        switch (_input1.nextLine()) {
            case "1" ->
                NameInput.main(argss);
            case "2" ->
                Integer_Operations.main(argss);
            case "3" ->
                Switch_Sections.main(argss);
            case "4" ->
                Sections.main(argss);
            case "5" ->
                NoahIntegerInput.main(argss);
            case "6" ->
                close_on_0.main(argss);
            default ->
                System.out.println("Invalid Choice!");
        }
    }
}
