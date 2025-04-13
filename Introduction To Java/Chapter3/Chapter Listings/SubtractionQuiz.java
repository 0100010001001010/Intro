/*
 * The program can work as follows:
 *          1. Generate two single-digit integers into number1 and number2.
 *          2. If number1 < number2, swap number1 with number2.
 *          3. Prompt the student to answer, "What is number1 – number2?"
 *          4. Check the student’s answer and display whether the answer is correct.
 * 
 * DJ Booker    
 * 4/13/2025
 */

// import scanner class
import java.util.Scanner;

public class SubtractionQuiz {

    public static void main(String[] args) {

        // generate two single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // if number1 < number2, swap number1 with number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // create a Scanner object and ask for user input
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        try (Scanner input = new Scanner(System.in)) {
            int answer = input.nextInt();
            input.close(); // close the scanner

            // check the answer and display the result to the console
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
            } else {
                System.out.println("Your answer is wrong.");
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
            }
        }
    }
}
