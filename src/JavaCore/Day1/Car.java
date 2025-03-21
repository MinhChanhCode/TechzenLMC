package JavaCore.Day1;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number 1 is: ");
        int id1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Number 2 is: ");
        int id2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Number 3 is: ");
        int id3 = Integer.parseInt(scanner.nextLine());
        System.out.print("Number 4 is: ");
        int id4 = Integer.parseInt(scanner.nextLine());
        System.out.print("Number 5 is: ");
        int id5 = Integer.parseInt(scanner.nextLine());

        int total = id1 + id2 + id3 + id4 + id5;
        int numberBt = total % 10;

        System.out.println("Number car is: " + id1 + id2 + id3 + id4 + id5 );
        System.out.println("Number Button Car is: " + numberBt);

    }
}
