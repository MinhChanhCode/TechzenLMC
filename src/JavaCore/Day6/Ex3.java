package JavaCore.Day6;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string a: ");
        String a = scanner.nextLine();

        System.out.print("Enter string b: ");
        String b = scanner.nextLine();

        int result = a.compareTo(b);

        if (result > 0) {
            System.out.println("String a > String b");
        } else if (result < 0) {
            System.out.println("String a < String b");
        } else {
            System.out.println("String a = String b");
        }

        scanner.close();
    }
}
