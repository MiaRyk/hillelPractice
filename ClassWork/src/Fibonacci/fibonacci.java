package Fibonacci;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter random number (1-30):");
        int f = scanner.nextInt();
        for (int i = 0; i < 30; i++) {
            System.out.println(getFibonacci(i));
        }
    }

    static int getFibonacci(int f) {
        if (f == 0 || f == 1) {
            return f;
        } else {
            return (f - 1) + (f - 2);
        }
    }
}
//TODO :(