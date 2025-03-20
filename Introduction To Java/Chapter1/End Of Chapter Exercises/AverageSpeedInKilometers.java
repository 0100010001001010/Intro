/*
 * Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a program that displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)
 * 
 * DJ Booker
 * 20 Mar 2025
 */

public class AverageSpeedInKilometers {

    public static void main(String[] args) {
        // Given values
        double miles = 24;
        int hours = 1;
        int minutes = 40;
        int seconds = 35;

        // Convert time to hours
        double totalTimeInHours = hours + (minutes / 60.0) + (seconds / 3600.0);

        // Convert miles to kilometers
        double kilometers = miles * 1.6;

        // Calculate average speed in kilometers per hour
        double averageSpeedKph = kilometers / totalTimeInHours;

        // Display the result
        System.out.printf("Average speed: %.2f km/h\n", averageSpeedKph);
    }
}
