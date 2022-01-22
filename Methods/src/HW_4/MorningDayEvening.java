package HW_4;

import java.util.Scanner;

public class MorningDayEvening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the time: ");
        int time = scanner.nextInt();
        String respond = getRespond(time);
        System.out.println(respond);
    }

    static String getRespond(int time) {
        if (time >= 18) {
            return "Good evening!";
        } else if (time < 10) {
            return "Good morning!";
        } else {
            return "Good day!";
        }
    }
}

