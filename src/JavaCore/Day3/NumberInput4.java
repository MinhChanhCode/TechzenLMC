package JavaCore.Day3;

import java.util.Scanner;

public class NumberInput4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2) {
            if (i % 6 == 0) {
                System.out.printf("-%-4d", i);
            } else {
                System.out.printf("%-4d", i);
            }

        }
    }
}
