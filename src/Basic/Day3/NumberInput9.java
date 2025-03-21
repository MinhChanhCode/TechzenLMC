package Basic.Day3;

import java.util.Scanner;

public class NumberInput9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int a = 1;

        for (int i = 1; i <= n; i = 2 * i + 1) {
            if (i % 3 == 0) {
                System.out.print(-i + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
