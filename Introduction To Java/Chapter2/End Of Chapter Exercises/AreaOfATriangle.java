/* 
 * Write a program that prompts the user to enter three points (x1, y1), (x2, y2), (x3,y3) of a triangle and displays its area.
 *                  The formula for computing the area of a triangle is
 *                                      s = (side1 + side2 + side3)/2;
 *                                      area = 2s(s- side1)(s-side2)(s-side3)
 * 
 * DJ Booker
 * 2025-03-24
 */

// import scanner
import java.util.Scanner;

public class AreaOfATriangle {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter three points and assign them
        System.out.println("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        // close scanner
        input.close();

        // calculate the sides of the triangle using the distance formula
        // distance = √((x₂-x₁)² + (y₂-y₁)²)
        // calculate s
        // s = (side1 + side2 + side3)/2;
        // Calculate the sides first using the correct distance formula
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)); 
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        // Calculate s using the actual sides
        double s = (side1 + side2 + side3) / 2;

        // Calculate area using Heron's formula
        double area = Math.round(Math.sqrt(s * (s - side1) * (s - side2) * (s - side3)) * 10.0) / 10.0;

        // display the area to the console
        System.out.println("The area of the triangle is " + area);

    }
}
