package computer10;

import java.util.Scanner;

public class close_on_17 {

    public static void main(String[] args) {
        while (true) {
            Scanner _input1 = new Scanner(System.in);
            System.out.println("Enter a number");
            int num1 = _input1.nextInt();
            switch (num1) {
                case 1 ->
                    System.out.println("Topaz");
                case 2 ->
                    System.out.println("7 - Sapphire");
                case 3 ->
                    System.out.println("Sardonyx");
                case 4 ->
                    System.out.println("8 - Jascint");
                case 5 ->
                    System.out.println("Jasper");
                case 6 ->
                    System.out.println("9 - Emerald");
                case 7 ->
                    System.out.println("Jade");
                case 8 ->
                    System.out.println("10 - Amethyst");
                case 9 ->
                    System.out.println("Beryl");
                case 10 ->
                    System.out.println("11 - Crysolite");
                case 11 ->
                    System.out.println("Ruby");
                case 12 ->
                    System.out.println("12 - Chalcedony");
                case  17->System.exit(0);
                default->
                    System.out.println("Unknown Section");
            }
        }
    }
}