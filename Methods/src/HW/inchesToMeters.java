//Write a Java program that reads a number in inches, converts it to meters.
package HW;

import java.util.Scanner;

public class inchesToMeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value for inches:");
        double inches = scanner.nextDouble();
        double metersInInch = 0.0254;
        double meters = getMeters(inches, metersInInch);
        System.out.println(inches + " inches is " + meters + " meters");
    }

    static double getMeters(double inches, double metersInInch) {
        return inches * metersInInch;
    }
}