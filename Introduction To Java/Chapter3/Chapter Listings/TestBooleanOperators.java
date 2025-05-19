/*
* Listing 3.6 gives a program that checks whether a number is divisible by 2 and 3, by 2 or 3, and by 2 or 3 but not both:
* 
* DJ Booker
* May 19, 2025 
*/

// import scanner
import java.util.*;

public class TestBooleanOperators {

    public static void main(String[] args) {

        // create scanner object to retrieve input
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an intger: ");
        int number = userInput.nextInt();
        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number + " is divisible by 2 and 3.");
        }
        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3.");
        }
        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println(number + " is divisible by 2 or 3, but not both.");
        }
        userInput.close(); // close the scanner18
    }
}