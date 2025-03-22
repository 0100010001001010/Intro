/* 
 * Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. 
 * For example, if the user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5 as gratuity and $11.5 as total
 * 
 * DJ Booker
 * 22 MAR 2025
 */

// import scanner
import java.util.*;

public class CalculateTips {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // create scanner
        try (Scanner input = new Scanner(System.in)) {

            // read the subtotal and the gratuity rate
            System.out.print(
                    "Enter the subtotal: ");
            double subTotal = input.nextDouble();
            System.out.print(
                    "Enter the gratuity rate: ");
            double gratuityRate = input.nextDouble();
            input.close();

            // computes the gratuity
            double gratuity = subTotal * gratuityRate / 100;

            // compute new total
            double newTotal = subTotal + gratuity;

            // computes the total
            System.out.println("The gratuity is $" + gratuity + " and the subtotal is $" + newTotal);
        }
    }

}
