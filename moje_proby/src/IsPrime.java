public class IsPrime {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            System.out.println(isPrime(IsEven.getNumber()));
        }
    }

    public static boolean isPrime(int number) {
        {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }

    }

}
