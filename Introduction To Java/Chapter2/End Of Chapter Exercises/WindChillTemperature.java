/* 
 * How cold is it outside? The temperature alone is not enough to provide the answer. Other factors including wind speed, relative humidity, and sunshine play important roles in determining coldness outside.
 * In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature to measure the coldness using temperature and wind speed. The formula is
 * twc = 35.74 + 0.6215ta- 35.75v0.16 + 0.4275tav0.16
 * where ta is the outside temperature measured in degrees Fahrenheit and v is the speed measured in miles per hour. twc is the wind-chill temperature. The formula cannot be used for wind speeds below 2 
 * mph and temperatures below -58 ºF or above 41ºF.
 * Write a program that prompts the user to enter a temperature between -58 ºF and 41ºF and a wind speed greater than or equal to 2 and displays the wind-chill temperature. Use Math.pow(a, b) to compute 
 * v^0.16
 * 
 * DJ Booker
 * 2025-03-23
 */

// import Scanner
import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args) {
        // create Scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to enter temperature
        System.out.print("Enter the temperature in Fahrenheit between -58\u00B0F and 41\u00B0F: ");
        double temperature = input.nextDouble();

        // prompt user to enter wind speed
        System.out.print("Enter the wind speed in miles per hour (greater than or equal to 2): ");
        double windSpeed = input.nextDouble();

        // close Scanner
        input.close();

        // calculate wind-chill temperature
        double windChill = Math.round((35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
                + 0.4275 * temperature * Math.pow(windSpeed, 0.16)) * 100000.0) / 100000.0;

        // display wind-chill temperature to console
        System.out.println("The wind-chill temperature is " + windChill);

    }
}
