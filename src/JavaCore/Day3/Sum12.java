package JavaCore.Day3;

import java.util.Scanner;

public class Sum12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int m = scanner.nextInt();

        int sum = 0;
        int multi = 1;

        while (m > 0) {
            int digit = m % 10;
            sum += digit;
            multi *= digit;
            m = m / 10;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Multiplication = " + multi);

    }
}
