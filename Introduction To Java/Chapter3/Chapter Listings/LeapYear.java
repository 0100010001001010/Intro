/*
 * Listing 3.7 gives the program that lets the user enter a year and checks whether it is a leap year.
 * 
 * DJ Booker
 * May 19, 2025
 */

// import scanner
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {

        // create scanner and check user input for leap year
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = userInput.nextInt();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0));
        userInput.close(); // close scanner

        // display the result to the console
        System.out.println(year + " is a leap year? " + isLeapYear);
    }
}
