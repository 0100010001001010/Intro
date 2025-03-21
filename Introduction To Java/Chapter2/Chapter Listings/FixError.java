/*
 * Identify and fix the errors in the following code:
        1 public class Test {
        2   public void main(string[] args) {
        3      double i = 50.0;
        4      double k = i + 50.0;
        5      double j = k + 1;
        6
        7  System.out.println("j is " + j + " and
        8                        k is " + k);
        9  }
        10 
 */

public class FixError {

    /**
     * @param args
     */
    //The main method was missing
    public static void main(String[] args) {

        double i = 50.0;
        double k = i + 50.0;
        double j = k + 1;

        System.out.println("j is " + j + " and k is " + k);

    }

}
