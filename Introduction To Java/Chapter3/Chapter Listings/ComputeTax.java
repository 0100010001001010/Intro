/*
 * gives the solution for computing taxes for single filers. The complete solution is left as an exercise.
 * 
 * DJ Booker
 * 2 May 2025
 */

// import scanner
import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {

        // prompt for the filing status
        Scanner input = new Scanner(System.in);
        System.out.println(
                "(0-Single Filer, 1-Married Jointly or " + "qualifying widow(er), 2-Married Separatly, 3-Head of " +
                        "household) Enter the filing satus: ");
        int status = input.nextInt();
        System.err.print("Enter the taxable income: ");
        double income = input.nextDouble();
        input.close(); // close the scanner

        // compute the tax
        double tax = 0;
        if (status == 0) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                        + (income - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
                        + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;

        } else if (status == 1) {
            // compute tax for married filling jointly or qualifying widow(er)

        } else if (status == 2) {
            // compute tax for married seperatly

        } else if (status == 3) {
            // compute tax for heed of household
            
        } else {
            System.out.println("Error: invalid satus");
            System.exit(1);
        }

        // display the result
        System.out.println("Tax is " + (int) (tax * 100.0) / 100.0);
    }
}