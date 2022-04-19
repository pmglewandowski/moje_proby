import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        firstOperation(1, 2, 3);
        secondOperation(1, 2, 3);
        System.out.println(firstLogic(2, 2, 3));
    }

    public static void firstOperation(double a, double b, double c) {
        System.out.println((a + b) * c);
    }

    public static void secondOperation(double a, double b, double c) {
        System.out.println(a - b / c);
    }

    public static boolean firstLogic(double a, double b, double c) {
        return (a + b) > c;

    }


}
