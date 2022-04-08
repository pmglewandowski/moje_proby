import java.util.Scanner;

public class GetTotal {
    public static void main(String[] args) {
        System.out.println("Suma liczb wynosi: "+ getTotal(getNum1(),getNum2()));;

    }
    public static int getNum1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        int x = scanner.nextInt();
        return x;
    }
    public static int getNum2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę:");
        int y = scanner.nextInt();
        return y;
    }
    public static int getTotal(int x, int y){
        return x+y;
    }
}
