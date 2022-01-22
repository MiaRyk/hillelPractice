package HW;

import java.util.Scanner;

public class minutesToYearsAndDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of minutes:");
        int minutes = scanner.nextInt();
        int days = getDays(minutes);
        int years = getYears(minutes);
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }

    static int getDays(int minutes) {
        return (minutes / 60 / 24) % 365;
    }

    static int getYears(int minutes) {
        int minutesInYear = 525600;
        return minutes / minutesInYear;
    }
}
