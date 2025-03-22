/* 
 * Write a program to show the currrent time
 * 
 * DJ Booker
 * 21 MAR 2025
 */

public class ShowCurrentTime {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalmilliseconds = System.currentTimeMillis();

        //Obtain the total seconds since midnight, Jan 1 1970
        long totalSeconds = totalmilliseconds / 1000;

        //Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        //Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        // Display results to the console
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

    }
}
