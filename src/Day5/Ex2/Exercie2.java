package Day5.Ex2;

import java.util.Scanner;

public class Exercie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter integer n: ");
            n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a positive integer (n > 0), Please enter!!!");
            }
        } while (n <= 0);

        System.out.printf("Number %d after inversion is: %d", n, reversedNumber(n));

        if (isSymetricalNumber(n)) {
            System.out.printf("Number %d is a symmetric number\n", n);
        } else {
            System.out.printf("Number %d not is a symmetric number\n", n);
        }

        if (isSquareNumber(n)) {
            System.out.printf("Number %d is a square number\n", n);
        } else {
            System.out.printf("Number %d not is a square number\n", n);
        }

        if (isPrimeNumber(n)) {
            System.out.printf("Number %d is prime number\n", n);
        } else {
            System.out.printf("Number %d not is prime number\n", n);
        }

        System.out.printf("Sum of odd digits of a number %d = %d\n", n, calculateTotalOddDigits(n));
        System.out.printf("Sum of prime numbers = %d\n", calculateTotalPrimeDigits(n));
        System.out.printf("Sum of square numbers = %d\n", calculateTotalSquareDigits(n));
    }

    public static int reversedNumber(int n) {
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        return reverse;
    }

    public static boolean isSymetricalNumber(int n) {
        return n == reversedNumber(n);
    }

    public static boolean isSquareNumber(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    public static boolean isPrimeNumber(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int calculateTotalOddDigits(int n) {
        int total = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                total += digit;
            }
            n /= 10;
        }
        return total;
    }

    public static int calculateTotalPrimeDigits(int n) {
        int total = 0;
        while (n != 0) {
            int digit = n % 10;
            if (isPrimeNumber(digit)) {
                total += digit;
            }
            n /= 10;
        }
        return total;
    }

    public static int calculateTotalSquareDigits(int n) {
        int total = 0;
        while (n != 0) {
            int digit = n % 10;
            if (isSquareNumber(digit)) {
                total += digit;
            }
            n /= 10;
        }
        return total;
    }
}
