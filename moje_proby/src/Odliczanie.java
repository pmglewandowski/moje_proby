public class Odliczanie {
    public static void main(String[] args) {
        counting(IsEven.getNumber());
    }


    public static void counting(int x) {
        for (int i = x; i <= x && i >= 0; i--) {
            System.out.println("Bomba wybuchnie za " + i);

        }

    }
}
