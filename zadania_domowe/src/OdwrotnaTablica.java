import java.util.Arrays;
import java.util.Scanner;

public class OdwrotnaTablica {
    public static void main(String[] args) {
        int n = getNumberOfElements();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj " + (i + 1) + ". element tablicy: ");
            numbers[i] = getNumber();
        }
        System.out.println("Twoja tablica to: " + Arrays.toString(numbers));

        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = numbers[(n - 1) - i];
        }
        System.out.println("Twoja odwrócona tablica to: " + Arrays.toString(reversed));
    }


    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static int getNumberOfElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę elementów w tablicy: ");
        int number = scanner.nextInt();
        return number;
    }
}
