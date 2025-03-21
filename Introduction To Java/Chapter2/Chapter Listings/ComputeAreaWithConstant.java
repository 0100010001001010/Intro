
import java.util.Scanner;

public class ComputeAreaWithConstant {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final double PI = 3.14159; // Declare a constant

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Compute Area
        double area = radius * radius * PI;

        //Display result
        System.out.println("The area for the circle of radius " + radius + " is " + area);

    }
}
