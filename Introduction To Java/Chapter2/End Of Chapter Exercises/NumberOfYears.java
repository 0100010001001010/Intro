
/* 
 * Write a program that prompts the user to enter the minutes (e.g., 1 billion), and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days.
 * 
 * DJ Booker
 * 2025-03-23
 */

// import scanner
import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter the minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        input.close();

        // calculate the years and days
        int years = minutes / 525600;
        int days = (minutes % 525600) / 1440;

        // display the results
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        



    }
}
