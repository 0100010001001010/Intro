/* 
 * Write a program that reads in the radius and length of a cylinder and computes the area and volume using the following formulas:
                                        area = radius * radius * p
                                        volume = area * length
 */

// import scanner
import java.util.*;

public class VolumeOfACylinder {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Scanner reads in the radius and length of a cylinder
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(
                    " Enter the radius of the cylinder: E.g, 5.5, 2, 10.3 ");
            double radius = input.nextDouble();
            System.out.println(
                    "Enter the length of the cylinder: E.g, 1.1, 6, 95 ");
            double length = input.nextDouble();
            input.close();

            // compute the area and volume
            double p = 3.14159;
            double area = radius * radius * p;
            double volume = area * length;

            //Display area and volume to the console
            System.out.println("The area is " + area);
            System.out.println("The volume is " + volume);
        }

    }
}
