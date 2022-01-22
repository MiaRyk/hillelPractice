package Reverse;

import javax.xml.stream.events.Characters;
import java.util.Collections;
import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some words or symbols:");
        String str = scanner.nextLine();
        char[] strArr = str.toCharArray();
        for (int i = strArr.length - 1; i >= 0; i--) {
            System.out.print(strArr[i]);
        }
    }
}