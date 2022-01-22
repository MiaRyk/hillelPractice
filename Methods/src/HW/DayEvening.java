package HW;

import java.util.Scanner;

public class DayEvening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the time: ");
        int time = scanner.nextInt();
        String respond = getRespond(time);
        System.out.println(respond);
    }

    static String getRespond(int time) {
        if (time < 18) {
            return "Good day!";
        } else {
            return "Good evening!";
        }
    }
}
