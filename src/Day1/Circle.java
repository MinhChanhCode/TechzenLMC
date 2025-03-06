package Day1;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = scanner.nextDouble();

        double C = 2 * 3.14 * r;
        double A = 3.14 * Math.pow(C, 2);

        System.out.println("Perimeter is: " + C);
        System.out.println("Area is : " + A);
    }

}
