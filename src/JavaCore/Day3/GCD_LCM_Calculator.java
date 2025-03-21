package JavaCore.Day3;

import java.util.Scanner;

public class GCD_LCM_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = scanner.nextInt();

        System.out.print("Enter b : ");
        int b = scanner.nextInt();

        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("UCLN : " + i);
                break;
            }
        }
        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("BCNN : " + i);
                break;
            }
        }
    }
}
