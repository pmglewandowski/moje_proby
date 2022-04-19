import java.util.Arrays;
import java.util.Scanner;

public class TablicaImion {
    public static void main(String[] args) {
        String[] names = new String[5];
        for (int i = 0; i < 5; i++) {
            names[i] = getNames();

        }
        System.out.println(Arrays.toString(names));

    }

    public static String getNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = scanner.next();
        return name;
    }
}
