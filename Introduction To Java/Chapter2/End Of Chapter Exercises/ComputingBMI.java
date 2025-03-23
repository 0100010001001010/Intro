/* 
 * Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. 
 * Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI. 
 * Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 * 
 * DJ Booker
 * 2025-03-23
 */

// import scanner
import java.util.Scanner;

public class ComputingBMI {
    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // prompt user to enter height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        // close scanner
        input.close();

        // convert weight to kilograms
        double weightInKilograms = weight * 0.45359237;

        // convert height to meters
        double heightInMeters = height * 0.0254;

        // calculate BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // display the results to the console
        System.out.printf("BMI is %.4f\n", bmi);

    }

}
