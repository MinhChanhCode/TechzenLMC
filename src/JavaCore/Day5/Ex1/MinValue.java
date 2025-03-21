package JavaCore.Day5.Ex1;

public class MinValue {

    public static void main(String[] args) {
        System.out.println(minValue(5, 12, 90, 2));
        System.out.println(minValue(33, 24, 78, 5));
        System.out.println(minValue(-3, -7, 99, 8));
    }

    public static int minValue(int a, int b, int c, int d) {
        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        if (d < min) {
            min = d;
        }

        return min;

    }
}
