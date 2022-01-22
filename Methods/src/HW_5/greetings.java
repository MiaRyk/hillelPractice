//Make a function that will return a greeting statement that uses an input; your program should return,
//"Hello, <name> how are you doing today?".
package HW_5;

import java.util.Scanner;

public class greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name please:)");
        String name = scanner.nextLine();
        StringBuffer str = new StringBuffer("Hello,  how are you doing today?");
        System.out.println(str.insert(7, name));
    }
}
