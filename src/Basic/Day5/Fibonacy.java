package Basic.Day5;

import java.util.Scanner;

public class Fibonacy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of atoms you want to print Fibonacy: ");
        int n = scanner.nextInt();

        System.out.printf("%d element of the sequence Fibonacy: ", n);
    }

    static void printsNelementsFibonacci(int n) {
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
