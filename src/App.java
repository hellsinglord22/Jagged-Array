import java.util.Scanner;

/**
 * Make a program to store the value of sales of each day in the year
 * and make it easy to the programmer later to get this information
 * and calculate average for a month or a year or two months or two
 * years using jagged array to make the best use of the space
 * **/
public class App {
    public static void main(String[] args) {
        /// Attributes ///
        double[][] annualSales = new double[12][];
        Scanner input = new Scanner(System.in);
        boolean leap = isLeap();

    }

    /** Create isLeap method to check if it's a leap year or not **/
    public static boolean isLeap(){
        Scanner input = new Scanner(System.in);
        String leap;
        System.out.printf("Enter yes for leap and no for not leap: ");
        leap = input.next();

        if (leap.equals("yes")) {
            return true;
        }else {
            return false;
        }

    }
}
