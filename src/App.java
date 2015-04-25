import java.lang.reflect.AnnotatedArrayType;
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

        ///make jagged array ///
        for (int i = 0; i < annualSales.length; i++) {
            if (i == 3 || i == 5 ||
                    i == 8 || i == 10) {
                annualSales[i] = new double[30];
            }else if (i == 1) {
                if (leap) {
                    annualSales[i] = new double[29];
                } else {
                    annualSales[i] = new double[28];
                }
            } else {
                annualSales[i] = new double[31];
            }
        }


        // Print the 2D jagged array //
        for(int i = 0 ; i < annualSales.length ; i ++ ) {
            double[] sub = annualSales[i];
            for (int j = 0; j < sub.length; j++) {
                System.out.printf("%.0f ", sub[j]);
            }
            System.out.println();
        }

    }

    /** Create isLeap method to check if it's a leap year or not **/
    public static boolean isLeap(){
        Scanner input = new Scanner(System.in);
        String leap;
        System.out.printf("Enter yes for leap and no for not leap: ");
        leap = input.next();
        input.close();

        if (leap.equals("yes")) {
            return true;
        }else {
            return false;
        }

    }
}
