package computer10;
import java.util.Scanner;
public class Integer_Operations {
    public static void main(String[] args) {
        Scanner _input2;
        double sum;
        double difference;
        double quotient;
        double product;
        try(var _input1=new Scanner(System.in)){
            System.out.println("Your first Number:");
            double num1 =_input1.nextDouble(); // Variable for the first number!
            _input2 =new Scanner(System.in);
            System.out.println("Your second Number:");
            double num2 =_input2.nextDouble(); // Variable for the second number!
            sum =num1+num2; // Variable for the sum of the numbers!
            difference =num1 - num2; // Variable for the difference of the numbers!
            quotient =num1/num2; // Variable for the quotient of the numbers!
            product =num1*num2; // Variable for the product of the numbers!
        }
        _input2.close(); // Closed the inputstream to avoid resource leaks!
        System.out.println("sum:"+ sum); // Display the output output of the sum
        System.out.println("difference:"+ difference); // Display the output output of the differnce!
        System.out.println("quotient:"+ quotient); // Display the output output of the quotient!
        System.out.println("product:" + product); // Display the output output of the product!
    }
}
