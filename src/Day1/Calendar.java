package Day1;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();

        int sum = a + b;
        int x = a - b;
        int t1 = a * b;
        double t2 = (double) a / b;

//        System.out.println(a+b);
//        System.out.println(a-b);
//        System.out.println(a*b);
//        System.out.println((double)a/b); //if double submit = double != 0

        System.out.println("Sum is" + sum);
        System.out.println("Different is " + x);
        System.out.println("Product is" + t1);
        System.out.println("Quotient is" + t2);

    }
}
