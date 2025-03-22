/* 
 * Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer. For example, if an integer is 932, the
 * sum of all its digits is 14.
 *         
 *      Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 * 
 * 
 * 
 * 
 * DJ Booker
 * 22 MAR 2025
 */

// import scanner
import java.util.*;

public class SumOfDigits {

    public static void main(String[] args) {
        // establish variables
        double number;

        // create scanner
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(
                    "Enter a number between 0 and 1000: ");
            number = input.nextDouble();
            input.close();
        }

        // Convert the number to a string
        String numStr = String.valueOf(number) + 1;

        // Sum the digits using stream API without loops or if statements     //
        int sum = numStr.chars().map(Character::getNumericValue).sum();      // <---- NEEDED HELP WITH lines 32 and 35!!

        // Print the sum of the digits
        System.out.println("The sum of the digits is: " + sum);

    }
}
