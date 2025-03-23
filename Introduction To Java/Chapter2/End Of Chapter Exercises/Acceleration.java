/* 
 * Average acceleration is defined as the change of velocity divided by the time taken to make the change, as shown in the following formula: 
 *                                          
 *                                                                      v1 - v0  
 *                                                        a =   ---------------------
 *                                                                         t
 * 
 * Write a program that prompts the user to enter the starting velocity v0 in meters/second, the ending velocity v1 in meters/second, and the time span t in seconds, and displays the average acceleration. 
 * 
 * DJ Booker
 * 2025-03-23
 */

import java.util.Scanner;

public class Acceleration {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter v0, v1, and t
        System.out.print("Enter v0, v1, and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        input.close();

        // calculate the average acceleration
        double a = Math.round((v1 - v0) / t * 10000.0) / 10000.0; // can be found in the API

        // display the results
        System.out.println("The average acceleration is " + a);
        
    }
}
