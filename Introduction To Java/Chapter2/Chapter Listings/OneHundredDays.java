/*
 * If today is Tuesday, what will be the day in 100 days?
 * 
 */

public class OneHundredDays {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //Establish equation
        int dayCalulation = (2 + 100) % 7; // The day is tuesday so that is (2) after 100 days

        //Return result to the console
        System.out.print(dayCalulation + " is the remainder value so in 100 days it will be Thurdsay");
    }
}
