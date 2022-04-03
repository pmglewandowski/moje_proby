public class Main {
    public static void main(String[] args) {


        int x = 10;
        int y = x + 2;
        int z = 20;
        int s = z - x;
        int d = z / x + 30;
        int f = d * y;

//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(s);
//        System.out.println(d);
        System.out.println(f);

        f += 10;
        f++;
        System.out.println(f);

        f -= 10;
        System.out.println(f);
        System.out.println(f + 100);
        System.out.println(f);

        int v = 5 * 5;
        System.out.println(v);
        System.out.println(10 * 2);

        int i = 10 / 2;
        System.out.println(i);

        int j = 10 % 3;
        System.out.println(j);
        System.out.println(j);

        float a = 5 / 3;
        double b = 5 / 3;

        System.out.println(a);
        System.out.println(b);

        float c = 5f / 3;
        double d = 5d / 3;

        System.out.println(c);
        System.out.println(d);


    }
}
