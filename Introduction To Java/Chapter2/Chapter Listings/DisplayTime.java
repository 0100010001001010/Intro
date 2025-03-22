/*
 * obtain minutes and remaining seconds from an amount of time in seconds. For example, 500 seconds contains 8 minutes and 20 seconds.
 * 
 * DJ Booker
 * 21 MAR 2025
 */

import java.util.Scanner; // Import Scanner Class

public class DisplayTime {

    /**
     * @param args
     */
    public static void main(String[] args) {

        try (/// Create Scanner
        Scanner input = new Scanner(System.in)) {
            //Prompt User for input
            System.out.println("Enter an integer for seconds: ");
            int seconds = input.nextInt();
            input.close();

            //Find mins in secs
            int minutes = seconds / 60;

            //Seconds remaining
            int remainingSeconds = seconds % 60;

            //Print remaining seconds to the console
            System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
        }
    }
}
