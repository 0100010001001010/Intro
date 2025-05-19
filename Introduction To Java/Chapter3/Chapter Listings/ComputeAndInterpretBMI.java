/*
 * 
 * Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
 * Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 * 
 * DJ Booker
 * April 30th, 2025
 * 
 */

// import java scanner
import java.util.Scanner;

public class ComputeAndInterpretBMI {

    public static void main(String[] args) {

        // final variables
        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254; // Constant

        // open the scanner and prompt the user to enter Weight and Height
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter the height in inches: ");
        double height = input.nextDouble();
        input.close();

        // compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);


        // display the result to the console for the user
        // display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }


    /*
     * If your program was to compute the tax for the taxable income based on the filing status. The filing
        status can be determined using if statements outlined as follows:
                    if (status == 0) {
                    // Compute tax for single filers
                    }
                    else if (status == 1) {
                    // Compute tax for married filing jointly or qualifying widow(er)
                    }
                    else if (status == 2) {
                    // Compute tax for married filing separately
                    }
                    else if (status == 3) {
                    // Compute tax for head of household
                    }
                    else {
                    // Display wrong status
                    }
     * 
     */

}
