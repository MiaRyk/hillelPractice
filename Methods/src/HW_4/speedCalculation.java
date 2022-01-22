package HW_4;

import java.util.Scanner;

public class speedCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input distance in meters:");
        double meters = scanner.nextDouble();
        System.out.println("Input hours:");
        double hours = scanner.nextDouble();
        System.out.println("Input minutes:");
        double minutes = scanner.nextDouble();
        System.out.println("Input seconds:");
        double seconds = scanner.nextDouble();
        double speedInMPerS = getSpeedInMPerS(meters, hours, minutes, seconds);
        double speedInKmPerH = getSpeedInKmPerH(meters, hours, minutes, seconds);
        System.out.println("Your speed in meters/second is " + speedInMPerS);
        System.out.println("Your speed in km/h is " + speedInKmPerH);
    }

    static double getSpeedInMPerS(double meters, double hours, double minutes, double seconds) {
        return meters / (hours * 60 * 60 + minutes * 60 + seconds);
    }

    static double getSpeedInKmPerH(double meters, double hours, double minutes, double seconds) {
        return (meters / 1000) / (hours + minutes / 60 + seconds / 60 / 60);
    }
}
