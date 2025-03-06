package Day2;

import java.util.Scanner;

public class Equation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextInt();

        System.out.print("Nhập b: ");
        double b = scanner.nextInt();


        System.out.print("Nhập c: ");
        double c = scanner.nextInt();

        if (a == 0) {
            double x = b + c;
            System.out.println("Phương trình có nghiệm: x = " + x);
        } else {
            double dental = Math.pow(b, 2) - (4 * a * c);
            if (dental < 0) {
                System.out.println("Phương trình vô nghiệm.");

            } else if (dental == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có 1 nghiệm duy nhất : x = " + x);
            } else {
                double x1 = (-b - Math.sqrt(dental)) / (2 * a);
                double x2 = (-b + Math.sqrt(dental)) / (2 * a);

                System.out.println("Phương trình có 2 nghiệm");
                System.out.println("X1 = " + x1);
                System.out.println("X2 = " + x2);
            }

        }
    }
}
