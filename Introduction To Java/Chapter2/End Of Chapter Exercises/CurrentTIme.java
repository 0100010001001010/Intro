
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Scanner;

/* 
 * ShowCurrentTime.java, gives a program that displays the current time in GMT. Revise the program so that it prompts the user to enter 
 * the time zone offset to GMT and displays the time in the specified time zone.
 */
// import scanner
public class CurrentTIme {

    static int offset;

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalmilliseconds = System.currentTimeMillis();

        // ask user for time zone offset
        try (Scanner input = new Scanner(System.in)) {

            System.out.println(
                    "Enter the time zone offset to GMT: ");
            offset = input.nextInt();
            input.close();
        }

        // calculate the current time and display to the console
        // Convert the current time in milliseconds to an Instant object
        Instant instant = Instant.ofEpochMilli(totalmilliseconds);

        // Convert Instant to ZonedDateTime in GMT (UTC)
        ZonedDateTime gmtTime = instant.atZone(ZoneOffset.UTC);

        // Adjust the time by applying the time zone offset
        ZonedDateTime targetTime = gmtTime.withZoneSameInstant(ZoneOffset.ofHours(offset));

        // Display the current time in GMT and the converted time in the specified time zone
        System.out.println("Current time in GMT: " + gmtTime.toLocalTime());
        System.out.println("Converted time in GMT" + (offset >= 0 ? "+" : "") + offset + ": " + targetTime.toLocalTime());  // Used API for this

    }
}

/* 

 */
