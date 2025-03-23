/**
 * Write a program that prompts the user to enter two points (x1, y1) and (x2, y2) and displays their distance between them.
 * The formula for computing the distance is 2(x2- x1)2 + (y2- y1)2. Note that you can use Math.pow(a, 0.5) to compute 2a. 
 */

// import scanner
import java.util.Scanner;

public class DistanceOfTwoPoints {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter x1 and y1
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        // prompt user to enter x2 and y2
        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        // close scanner
        input.close();
        // calculate distance
        double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        
        // display the results to the console
        System.out.println("The distance between the two points is " + distance);
    }
}
