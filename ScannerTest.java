package Buoi2;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        int num1;
        double num2;
        String str;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        num1 = in.nextInt();
        System.out.print("Enter a floating point: ");
        num2 = in.nextInt();
        System.out.print("Enter a string: ");
        str = in.next();
        System.out.printf("%s, Sum of %d & %.2f is %.2f%n", str, num1, num2, num1+num2);
        in.close();
    }
}
