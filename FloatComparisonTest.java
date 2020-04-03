package Buoi2;

public class FloatComparisonTest {
    public static void main(String[] args) {
        double d1 = 2.2 + 4.4;
        double d2 = 6.6;
        System.out.println(d1 == d2);
        System.out.println(d1);

        final double EPSILON = 1 - 7;
        System.out.println(Math.abs(d1 - d2) < EPSILON);
    }
}
