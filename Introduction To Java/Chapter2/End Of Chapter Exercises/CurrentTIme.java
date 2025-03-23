
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

        // Get current time in GMT and target timezone
        Instant now = Instant.ofEpochMilli(totalmilliseconds);
        ZonedDateTime gmtTime = now.atZone(ZoneOffset.UTC);
        ZonedDateTime localTime = gmtTime.withZoneSameInstant(ZoneOffset.ofHours(offset));

        // Format timezone offset string
        String offsetStr = String.format("GMT%s%d", offset >= 0 ? "+" : "", offset);

        // Display times
        System.out.printf("Current time in GMT: %s%n", gmtTime.toLocalTime());
        System.out.printf("Current time in %s: %s%n", offsetStr, localTime.toLocalTime());

    }
}

/* 

 */
