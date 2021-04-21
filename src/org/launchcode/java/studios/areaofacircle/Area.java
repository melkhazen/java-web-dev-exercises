package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a radius of a circle: ");
        double radius = input.nextDouble();
        input.close();
        double areaOfACircle = Circle.getArea(radius);

        System.out.println("The circle area is: " + areaOfACircle);

    }
}
