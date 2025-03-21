/*
 * An example of reading multiple input from the keyboard. The program reads three numbers and displays their average.
 * 
 * DJ Booker   
 * 20 MAR 2025
 */

//Scanner is int the java.util package
import java.util.Scanner;

@SuppressWarnings("unused")
public class ComputeAverage {

    /**
     * @param args
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        //Create a scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter three numbers
        System.out.println("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        //Compute average 
        double average = (number1 + number2 + number3) / 3;

        //Display results
        System.err.println("THe average of " + number1 + " " + number2 + " " + number3 + " is "
                + average);

    }
}
