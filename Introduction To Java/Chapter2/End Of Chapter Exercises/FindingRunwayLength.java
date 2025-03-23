/* 
 * Given an airplane’s acceleration a and take-off speed v, you can compute the minimum runway length needed for an airplane to take off using the following formula:
 * 
 *                                                                      length = v^2 / 2a
 * 
 * Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration a in meters/second squared (m/s2), and displays the minimum run-
 * way length.
 * 
 * DJ Booker
 * 2025-03-23
 */

// import scanner
import java.util.Scanner;

public class FindingRunwayLength {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter speed and acceleration
        System.out.print("Enter speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
        input.close();

        // calculate the minimum runway length
        double length = Math.round(Math.pow(speed, 2) / (2 * acceleration) * 1000.0) / 1000.0;
        // display the results
        System.out.println("The minimum runway length for this airplane is " + length);

    }
}
