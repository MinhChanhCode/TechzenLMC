package JavaCore.Day3;

import java.util.Scanner;

public class NumberInput8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int a = 1;

        while (a <= n) {
            System.out.print(a + "\t");
            a = 2 * a + 1;
        }
    }
}
