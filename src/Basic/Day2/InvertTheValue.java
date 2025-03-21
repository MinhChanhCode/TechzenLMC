package Basic.Day2;

import java.util.Scanner;

public class InvertTheValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter b: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Initial value: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap value: a = " + a + ", b = " + b);


        //Cách 2:
        /*
        a =a+b;
        b=a-b;
        a=a-b;
         */

    }
}
