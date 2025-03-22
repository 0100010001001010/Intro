/* 
 * Write a program that reads a number in feet, converts it to meters, and displays the result. One foot is 0.305 meters.
 * 
 * DJ Booker
 */

// import scanner
import java.util.*;

public class FeetIntoMeters {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Create scanner to take a number in feet
        try (Scanner input = new Scanner(System.in)) {
            System.out.print(
                    "Enter a numaric value for feet: ");
            double feet = input.nextDouble();
            input.close();

            // Conver to meters
            double meters = feet * 0.305;  // Equation for calculating feet

            // display result to the console
            System.out.println(feet + " feet is " + meters + " meters.");
        }
    }
}
