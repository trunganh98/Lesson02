package Buoi2;

public class OddEvenSum {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 1000;
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;

        int number = lowerbound;
        while (number <= upperbound) {
            if (number % 2 == 0) {
                sumEven += number;
            }else {
                sumOdd += number;
            }
            ++number;
        }
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        }else {
            absDiff = sumEven - sumOdd;
        }
        // absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : sumEven - sumOdd;

        System.out.println("The sum of odd numbers from " + lowerbound + " to " + upperbound + " is: " + sumOdd);
        System.out.println("The sum of even numers from " + lowerbound + " to " + upperbound + " is: " + sumEven);
        System.out.println("The absoute difference between the two sums is: " + absDiff);
    }
}
