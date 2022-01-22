//Write a Java program to compute body mass index (BMI)
package HW_4;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input weight in pounds:");
        double weight = scanner.nextInt();
        System.out.println("Input height in inches:");
        double height = scanner.nextInt();
        double BMI = getBMI(weight, height);
        System.out.println("Body Mass Index is " + BMI);
    }

    static double getBMI(double weight, double height) {
        double convFac = 703;
        return (weight / (height * height)) * convFac;
    }
}
