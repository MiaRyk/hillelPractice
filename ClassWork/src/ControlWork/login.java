package ControlWork;

import java.util.Scanner;

public class login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = "IronCow";
        String password = "1235813F";
        System.out.println("Enter your username:");
        String enterUsername = scanner.nextLine();
         if (username.equals(enterUsername)){
            System.out.println("Correct username");
        }else{
             System.out.println( "Error.Try again");
        }
         if (username.equals(enterUsername)){
             System.out.println("Enter your password");
         }
         String enterPassword = scanner.nextLine();
         if (password.equals(enterPassword)) {
             System.out.println("Correct password");
         }else {
             System.out.println("Error.Try again");
         }
         if (password.equals(enterPassword)){
             System.out.println("Choose number (1-5) to get program");
         }
         int programN = scanner.nextInt();
        switch (programN) {
            case 1: 
                break;
            case 2:
                break;
            case 3:
            break;
            case 4:
                break;
            case 5:
                break;
         }

    }
}