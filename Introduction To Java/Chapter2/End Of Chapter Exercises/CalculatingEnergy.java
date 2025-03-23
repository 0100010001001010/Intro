/* 
 * Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature. Your program should prompt the user to enter the amount 
 * of water in kilograms and the initial and final temperatures of the water. The formula to compute the energy is:
 * 
 *                                              Q = M * (finalTemperature – initialTemperature) * 4184
 * 
 * where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy Q is measured in joules.
 * 
 * DJ Booker
 * 2025-03-23
 */

// import scanner
import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter the amount of water in kilograms
        System.out.print("Enter the amount of water in kilograms: ");
        double water = input.nextDouble();

        // prompt user to enter the initial and final temperatures of the water
        System.out.print("Enter the initial temperature: ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        double finalTemperature = input.nextDouble();
        input.close();

        // calculate the energy
        double energy = water * (finalTemperature - initialTemperature) * 4184;

        // display the results
        System.out.println("The energy needed is " + energy);

    }
}
