/* 
 * Write a program that reads a Celsius degree in a double value from the console, then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows: 
 * 
 *                                                          fahrenheit = (9.0 / 5) * celsius + 3
 *                                                      Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 * 
 * DJ Booker   
 * 21 MAR 2025
 */

// import scanner
import java.util.*;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        // create scannner
        try (Scanner input = new Scanner(System.in)) {

            // reads a Celsius degree in a double value from the console
            System.out.println(
                    "Enter a double value for the Celsius Degree E.g., 37.8: ");
            double celsius = input.nextDouble();
            input.close();

            // converts it to Fahrenheit
            double fahrenheit = (9.0 / 5) * celsius + 32;

            // displays the result
            System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
        }

    }
}
