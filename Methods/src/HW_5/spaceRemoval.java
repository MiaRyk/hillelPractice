//remove the spaces from the string, then return the resultant string.
package HW_5;

import java.util.Scanner;

public class spaceRemoval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = scanner.nextLine();
        System.out.println(str.replaceAll(" ", ""));
    }
}
