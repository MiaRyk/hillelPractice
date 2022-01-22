package HW_4;

import java.util.Scanner;

public class passwordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        int strLength = name.length() & password.length();
        boolean result = getStrLength(name, password);
        System.out.println(result);
    }

    static boolean getStrLength(String name, String password) {
        boolean str1 = (name.length() > 10 || name.length() < 3);
        boolean str2 = (password.length() > 25 || password.length() < 8);
        if (str1 & str2)
            return false;
        else
            return true;
    }
}