/* 
 * Here are the steps in developing the program:
            1. Prompt the user to enter the amount as a decimal number, such as 11.56.

            2. Convert the amount (e.g., 11.56) into cents (1156).

            3. Divide the cents by 100 to find the number of dollars. Obtain the remaining cents using
            the cents remainder 100.

            4. Divide the remaining cents by 25 to find the number of quarters. Obtain the remaining
            cents using the remaining cents remainder 25.

            5. Divide the remaining cents by 10 to find the number of dimes. Obtain the remaining
            cents using the remaining cents remainder 10.

            6. Divide the remaining cents by 5 to find the number of nickels. Obtain the remaining
            cents using the remaining cents remainder 5.

            7. The remaining cents are the pennies.

            8. Display the result.
 */

// import scanner
import java.util.*;

public class ComputeChange {

    public static void main(String[] args) {

        try (// create scanner
                Scanner input = new Scanner(System.in)) {

            // recieve the amount
            System.out.print(
                    "Enter an amount in double, for example 11.56: ");
            double amount = input.nextDouble();
            input.close();

            int remainingAmount = (int) (amount * 100);

            // find the number of one dollars 
            int numberOfOneDollars = remainingAmount / 100;
            remainingAmount = remainingAmount % 100;

            // find the number of quarters in the remaining amount
            int numberOfQuarters = remainingAmount / 25;
            remainingAmount = remainingAmount % 25;

            // Find the number of dimes in the remaining amount
            int numberOfDimes = remainingAmount / 10;
            remainingAmount = remainingAmount % 10;

            // Find the number of nickles in the remaining amount
            int numberOfNickles = remainingAmount / 5;
            remainingAmount = remainingAmount % 5;

            // find the numbers of pennies in the remaining amount
            int numberOfPennies = remainingAmount;

            // display results to the console
            System.out.println("Your amount " + amount + " consists of");
            System.out.println("   " + numberOfOneDollars + " dollars");
            System.out.println("   " + numberOfQuarters + " quarters ");
            System.out.println("   " + numberOfDimes + " dimes");
            System.out.println("   " + numberOfNickles + " nickles");
            System.out.println("   " + numberOfPennies + " pennies");
        }
    }
}
