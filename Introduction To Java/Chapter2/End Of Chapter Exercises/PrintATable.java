/* 
 * Write a program that displays the following table. Cast floating point numbers into integers.
 * 
 *                              a          b         pow(a, b)
 *                              1          2            1
 *                              2          3            8
 *                              3          4            81
 *                              4          5            1024
 *                              5          6            15625
 * 
 * DJ Booker
 * 2025-03-24
 */

public class PrintATable {
    public static void main(String[] args) {

        // Print the table header   
        System.out.println("a          b         pow(a, b)");

        // Print the table rows
        System.out.println("1          2         " + (int)Math.pow(1, 2));
        System.out.println("2          3         " + (int)Math.pow(2, 3));
        System.out.println("3          4         " + (int)Math.pow(3, 4));
        System.out.println("4          5         " + (int)Math.pow(4, 5));
        System.out.println("5          6         " + (int)Math.pow(5, 6));
    }
}
