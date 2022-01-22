package HW_4;

import java.util.Random;

public class randomIntegers {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int randomNumber = getRandomNumber(min,max);
        System.out.println("You got "+randomNumber);
    }
    static int getRandomNumber(int min, int max){
        return new Random().nextInt(max - min) + min;
    }
}
