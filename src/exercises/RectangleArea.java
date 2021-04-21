package exercises;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter length: ");
        int length = input.nextInt();
        System.out.println("enter height: ");
        int height = input.nextInt();
        input.close();
        System.out.println("your rectangle area is " + (height*length));
    }
}
