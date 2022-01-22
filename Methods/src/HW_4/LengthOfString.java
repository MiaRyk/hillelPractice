package HW_4;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String str = scanner.next();
        int strLength = getStrLength(str);
        String statusOfStr = getStatusOfStr(str);
        System.out.println(strLength);
        System.out.println(statusOfStr);
    }
    static int getStrLength (String str) {
        return str.length();
    }
    static String getStatusOfStr(String str){
        if (str.length() > 25) {
            return " error";
        }else {
            return " Everything is alright!";
        }
    }
}
