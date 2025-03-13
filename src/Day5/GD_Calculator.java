package Day5;

import java.util.Scanner;

public class GD_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập b: ");
        int b = scanner.nextInt();


        System.out.println("Ước chung lớn nhất là: " + GCDCalculator(a, b));

    }

    public static int GCDCalculator(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

