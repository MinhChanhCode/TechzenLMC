package JavaCore.Day3;

import java.util.Scanner;

public class Sum10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        System.out.println("Sum is = " + sum);
    }
}
