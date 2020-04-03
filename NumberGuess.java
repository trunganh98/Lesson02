package Buoi2;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        int secretNumber;
        int numberIn;
        int trialNumber = 0;
        boolean done = false;
        Scanner in = new Scanner(System.in);

        secretNumber = (int)(Math.random()*100);

        while (!done) {
            ++trialNumber;
            System.out.print("Enter your guess (between 0 and 99): ");
            numberIn = in.nextInt();
            if (numberIn == secretNumber) {
                System.out.println("Congratulation");
                done = true;
            } else if (numberIn < secretNumber) {
                System.out.println("Try higher");
            } else {
                System.out.println("Try lower");
            }
        }
        System.out.println("Yu got in " + trialNumber + " trials ");
        in.close();
    }
}
