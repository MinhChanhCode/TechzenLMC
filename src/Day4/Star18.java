package Day4;

import java.util.Scanner;

public class Star18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào bàn phím:  ");
        int n = scanner.nextInt();

        fibonaci(n);

    }

    public static void fibonaci(int n) {
        int f1 = 0;
        int f2 = 1;
        int fn = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(fn + "\t");
            f1 = f2;
            f2 = fn;

            fn = f1 + f2;
        }
    }
}
