package LearningProjects;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int attempt = 0;
        int num = random.nextInt(100) + 1;

        System.out.print("Guess The Number (From 1 to 100) : ");
        while(true) {

            int guess = scanner.nextInt();
            attempt++;

            if (guess > num) {
                System.out.println("too high !!");
                System.out.print("Try Again : ");

            } else if (guess < num) {
                System.out.println("too low !!");
                System.out.print("Try Again : ");

            } else {
                System.out.println("Whoa You won!!, the correct number was " + num + "!!");
                System.out.println("Total attempts were " + attempt);
                break;
            }

        }

        System.out.println("Thank You For Playing");

        scanner.close();
    }
}
