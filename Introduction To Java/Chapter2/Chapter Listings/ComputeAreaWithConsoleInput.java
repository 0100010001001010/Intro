/*
 * Writa a program to Compute the Area With Console Input
 * 
 * DJ Booker
 * 20 MAR 2019
 */

import java.util.Scanner; // Scanner is in the java.util package

public class ComputeAreaWithConsoleInput {

    /**
     * @param args
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        //Create the scanner object
        Scanner input = new Scanner(System.in);

        //Promtt the user to enter a radius
        System.out.println("Enter a number for raduis: ");
        double radius = input.nextDouble();

        //Compute Area
        double area = radius * radius * 3.1459;

        //Display Results
        System.out.println("The area for the sircle of radius "
                + radius + " is " + area);

    }
}
