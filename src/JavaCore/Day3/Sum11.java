package JavaCore.Day3;

import java.util.Scanner;

public class Sum11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        double sum = 0.0;
        double fact = 1;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / fact;
            fact *= (2 * i) * (2 * i + 1);
        }
        System.out.println("Sum = " + sum);
    }
}
