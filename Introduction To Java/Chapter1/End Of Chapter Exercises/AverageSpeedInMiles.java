/*
 * Assume a runner runs 14 kilometers in 45 minutes and 30 seconds. Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
 * 
 * DJ Booker
 * 10 MAR 2025
 * 
 */

public class AverageSpeedInMiles {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //First, convert the distance from kilometers to miles:
        double miles = 14 * 0.621371; //= 8.699194 miles

        //Next, convert the time from minutes and seconds to hours:
        double hours = 45.5 / 60; //0.75833

        //Now, calculate the average speed in miles per hour:
        double averageSpeed = miles / hours; //11.47

        //Display MPH to the console
        System.out.println(averageSpeed);
    }
}
