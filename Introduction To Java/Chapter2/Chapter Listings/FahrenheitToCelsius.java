
/* 
 * Write a program that converts a Fahrenheit degree to Celsius using the formula
 * celsius= (59 )(fahrenheit- 32).
 * 
 * DJ Booker   
 * 21 MAR 2025
 */
//Import Scanner
import java.util.Scanner;

public class FahrenheitToCelsius {

    /**
     * @param args
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        // Create Scanner and ask for user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        input.close();

        // Create variable and Convert Fahrenheit to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");

    }
}
