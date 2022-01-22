//Write a function to split a string and convert it into an array of words.
package HW_5;

import java.util.Arrays;
import java.util.Scanner;

public class stringToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a few words:");
        String str = scanner.nextLine();
        print(str.split(" "));
    }

    static void print(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
