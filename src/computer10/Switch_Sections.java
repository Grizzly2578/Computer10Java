package computer10;

import java.io.IOException;
import java.util.Scanner;

public class Switch_Sections {
    public static void ClearConsole() {
        try {
            String operatingSystem = System.getProperty("os.name"); //Check the current operating system

            if (operatingSystem.contains("Windows")) {
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();

                startProcess.waitFor();
            }
        } catch (IOException | InterruptedException e) {
            System.out.println(e);
        }
}

    public static void main(String[] args) throws IOException, InterruptedException {
        while (true) {
            Scanner _input1 = new Scanner(System.in);
            System.out.println("Enter a number");
            int num1 = _input1.nextInt();
            switch (num1) {
                case 1 ->{
                    ClearConsole();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Topaz");
                    
                }
                case 2 ->{
                    ClearConsole();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("7 - Sapphire");
                }
                case 3 ->{
                    ClearConsole();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Sardonyx");
                }
                case 4 ->{
        
                    ClearConsole();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("8 - Jascint");
                }
                case 5 ->{
                    
                    ClearConsole();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Jasper");
                }
                case 6 ->{
                    
                    ClearConsole();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("9 - Emerald");
                }
                case 7 ->{
                    
                    ClearConsole();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Jade");
                }
                case 8 ->{
                   
                    ClearConsole();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("10 - Amethyst");
                }
                case 9 ->{
                    
                    ClearConsole();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Beryl");
                }
                case 10 ->{
                    
                    ClearConsole();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("11 - Crysolite");
                }
                case 11 ->{
                    
                    ClearConsole();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("Ruby");
                }
                case 12 ->{
                    
                    ClearConsole();
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();
                    System.out.println("12 - Chalcedony");
                }
            }
        }
    }
}
