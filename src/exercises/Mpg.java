package exercises;
import java.util.Scanner;

public class Mpg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many miles have you driven: ");
        int milesDriven = input.nextInt();
        System.out.println("How many gallons have you consumed: ");
        int gasConsumed = input.nextInt();
        input.close();

        int mpg = milesDriven / gasConsumed;
        System.out.println("your mpg is: " + mpg);
    }
}
