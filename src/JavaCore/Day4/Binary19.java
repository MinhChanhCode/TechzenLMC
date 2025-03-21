package JavaCore.Day4;

import java.util.Scanner;

public class Binary19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào bàn phím: ");

        int n = scanner.nextInt();

        String binary = "";

        while (n > 0) {
            int remainder = n % 2;

            binary = remainder + binary;

            n = n / 2;
        }

        System.out.println("Số nhị phân là: " + binary);
    }
}
