package Day3;

import java.util.Scanner;

public class NumberInput7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        int f1 = 0, f2 = 1, fn = 1;
        System.out.print("Fibonacci is : ");

        for (int i = 0; i < n; i++) {
            System.out.print(f1 + " ");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }
}
