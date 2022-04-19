import java.util.Scanner;

public class IsEven {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(isEven(getNumber()));
        }
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer: ");
        int number = scanner.nextInt();
        return number;
    }

    public static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else return false;

    }
}
