/* 
 * Show the output of the following code:
                        double a = 6.5;
                        a += a + 1;
                        System.out.println(a);
                        a = 6;
                        a /= 2;
                        System.out.println(a);

 */

public class CheckPointOutput {

    /**
     * @param args
     */
    public static void main(String[] args) {
        double a = 6.5; // here a = 6.5
        a += a + 1;     // here it becomes 7.5
        System.out.println(a);
        a = 6;
        a /= 2;
        System.out.println(a); // But here its 3 ---- :X XD
    }
}
