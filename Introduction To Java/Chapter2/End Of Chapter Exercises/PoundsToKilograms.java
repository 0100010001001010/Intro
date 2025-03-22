/* 
 * Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, 
 * converts it to kilograms, and displays the result. One pound is 0.454 kilograms
 * 
 * DJ Booker
 * 22 MAR 2025
 */

// import scanner
import java.util.*;

public class PoundsToKilograms {

    public static void main(String[] args) {

        // create scanner
        try (Scanner input = new Scanner(System.in)) {
            // prompts the user to enter a number in pounds
            System.out.print(
                    "Enter a number in pounds: ");
            double pounds = input.nextDouble();
            input.close();

            // converts it to kilograms with equation
            double kilograms = pounds * 0.454;  // <---- equation for converting LBS to KG

            // displays the result to console
            System.out.print(
                    pounds + " pounds is " + kilograms + " kilograms.");
        }
    }
}
