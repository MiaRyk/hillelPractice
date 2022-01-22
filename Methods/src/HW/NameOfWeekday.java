package HW;

import java.util.Scanner;

public class NameOfWeekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number (1-7): ");
        int number = scanner.nextInt();
        String result = getWeekday(number);
        System.out.println(result);
    }
    static String getWeekday (int number){
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Not exist :(";
        }
    }
}
