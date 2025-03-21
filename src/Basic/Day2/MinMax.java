package Basic.Day2;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();


        //Use if-else

//        if(a>b){
//            System.out.println("Max: " + a);
//            System.out.println("Min: " + b);
//        }else {
//            System.out.println("Max: " + b);
//            System.out.println("Min: " + a);
//        }

        //Use ternary operator

        int max = (a > b) ? a : b;
        int min = (a < b) ? a : b;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
