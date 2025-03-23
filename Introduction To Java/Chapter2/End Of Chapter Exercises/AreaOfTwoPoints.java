/* 
 * Write a program that prompts the user to enter the side of a hexagon and displays its area. The formula for computing the area of a hexagon is
 * 
 *                       Area = 3√3
 *                             ----- * s2     
 *                               2
 * 
 * where s is the length of a side. 
 */

// import scanner
import java.util.Scanner;

public class AreaOfTwoPoints {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter the side of a hexagon
        System.out.print("Enter the side of a hexagon: ");
        double side = input.nextDouble();

        // calculate the area of the hexagon
        double area = (3 * Math.pow(3, 3)) / 2 * Math.pow(side, 2);

        // close scanner
        input.close();

        // display the results to the console
        System.out.println("The area of the hexagon is " + area);

    }
}
