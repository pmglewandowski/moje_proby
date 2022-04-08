import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        isEven(getNumber());

    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer: ");
        int number = scanner.nextInt();
        return number;
    }

    public static void isEven(int x) {
        if (x % 2 == 0) {
            System.out.println("Number is even");
        } else System.out.println("Number is odd");
    }
}
