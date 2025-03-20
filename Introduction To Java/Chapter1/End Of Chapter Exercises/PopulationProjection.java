/*
 * The U.S. Census Bureau projects population based on the following assumptions:
 *                    ■ One birth every 7 seconds
 *                    ■ One death every 13 seconds
 *                    ■ One new immigrant every 45 seconds 
 * Write a program to display the population for each of the next five years. Assume the current population is 312,032,486 and 
 * one year has 365 days. Hint: In Java, if two integers perform division, the result is an integer. The fractional part is truncated. 
 * For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with the fractional part, one of the values 
 * involved in the division must be a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 * 
 * DJ Booker
 * 20 MAR 2025
 */

public class PopulationProjection {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Initial population
        int currentPopulation = 312032486;

        // Constants for birth, death, and immigration rates
        int birthsPerYear = 7;   // every 7 seconds, 1 birth occurs
        int deathsPerYear = 13;  // every 13 seconds, 1 death occurs
        int immigrantsPerYear = 45; // every 45 seconds, 1 immigrant comes

        // Seconds in one year (365 days)
        int secondsInYear = 365 * 24 * 60 * 60;

        // Calculate the total population growth in one year
        int totalBirths = secondsInYear / birthsPerYear;
        int totalDeaths = secondsInYear / deathsPerYear;
        int totalImmigrants = secondsInYear / immigrantsPerYear;

        // Calculate the new population for each of the next 5 years
        // Year 1
        currentPopulation = currentPopulation + totalBirths - totalDeaths + totalImmigrants;
        System.out.println("Year 1 population: " + currentPopulation);

        // Year 2
        currentPopulation = currentPopulation + totalBirths - totalDeaths + totalImmigrants;
        System.out.println("Year 2 population: " + currentPopulation);

        // Year 3
        currentPopulation = currentPopulation + totalBirths - totalDeaths + totalImmigrants;
        System.out.println("Year 3 population: " + currentPopulation);

        // Year 4
        currentPopulation = currentPopulation + totalBirths - totalDeaths + totalImmigrants;
        System.out.println("Year 4 population: " + currentPopulation);

        // Year 5
        currentPopulation = currentPopulation + totalBirths - totalDeaths + totalImmigrants;
        System.out.println("Year 5 population: " + currentPopulation);

    }
}
