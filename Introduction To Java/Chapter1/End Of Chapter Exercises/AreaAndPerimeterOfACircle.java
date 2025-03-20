/*
 * Write a program that displays the area and perimeter of a circle that has a radius of 5.5 using the following formula:
 *                              perimeter= 2 * radius * p
 *                              area = radius * radius * p
 */

public class AreaAndPerimeterOfACircle {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //Estsablish Variable
        double p = ((4.0) * ((1.0) - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7) + (1.0 / 9.0) - (1.0 / 11.0)));
        double radius = 5.5;
        double perimeter = 2 * radius * p;
        double area = radius * radius * p;

        //Display area and peremeter of a circle
        System.out.println(perimeter);
        System.out.println(area);

    }
}
