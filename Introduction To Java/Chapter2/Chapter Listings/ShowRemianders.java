/*
 * Show the result of the following remainders.
                56 % 6
                78 % -4
                -34 % 5
                -34 % -5
                5 % 1
                1 % 5
 *
 * DJ Booker
 * 21 MAR 2025
 */

public class showRemianders {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Establish Variables
        int remainder1 = 56 % 6;
        int remainder2 = 78 % -4;
        int remainder3 = -34 % 5;
        int remainder4 = -34 % -5;
        int remainder5 = 5 % 1;
        int remainder6 = 1 % 5;

        // Display the remainders to the console
        System.out.println("The remainder of 56 % 6 is: " + remainder1);
        System.out.println("The remainder of 78 % -4 is : " + remainder2);
        System.out.println("The remainder of -34 % 5 is : " + remainder3);
        System.out.println("The remainder of -34 % -5 is : " + remainder4);
        System.out.println("The remainder of 5 % 1 is : " + remainder5);
        System.out.println("The remainder of 1 % 5 is : " + remainder6);

    }
}
