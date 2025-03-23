/* 
 * prompt the user to enter the number of years and displays the population after the number of years.
 * 
 * DJ Booker
 * 2025-03-23
 */

// import scanner
import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter the number of years
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        input.close();
        // calculate the population
        int population = 312032486 + (365 * 24 * 60 * 60 / 7) * years - (365 * 24 * 60 * 60 / 13) * years
                + (365 * 24 * 60 * 60 / 45) * years;

        // display the results
        System.out.println("The population in " + years + " years is " + population);

    }
}
