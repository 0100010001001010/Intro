/*
 * Listing 3.1 gives the program. Lines 5–6 generate two numbers, number1 and number2. Line 14 obtains an answer from the user. The answer is graded in 
 * line 18 using a Boolean expression number1 + number2 == answer.
 * 
 * DJ Booker
 * 4/13/2025
 */

// import java.util.Scanner;
import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {

        // generate two random single-digit integers
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);

        // create a Scanner object and ask the user to enter an answer
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        input.close(); // close the scanner

        // check the answer and display the result to the console
        System.out.println(number1 + " + " + number2 + " = " + answer + " is "
                + (number1 + number2 == answer));
    }
}
