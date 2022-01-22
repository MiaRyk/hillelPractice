package EvenNumber;

import java.util.Scanner;
public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        String result = getEvenNumber(number);
        System.out.println(result);
    }

    public static String getEvenNumber(int number) {
        String respond1 = "Even number";
        String respond2 = "Error.Not even number";
        if (number % 2 == 0) {
            return respond1;
        } else {
            return respond2;
        }
    }
}

