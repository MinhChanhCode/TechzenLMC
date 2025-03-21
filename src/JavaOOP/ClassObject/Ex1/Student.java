package JavaOOP.ClassObject.Ex1;

import java.util.Scanner;

public class Student {
    String name;
    double scoreMath;
    double scoreLiterature;

    void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter score math: ");
        scoreMath = scanner.nextDouble();

        System.out.print("Enter score literature: ");
        scoreLiterature = scanner.nextDouble();
    }

    double caculateGPA() {
        return (scoreMath + scoreLiterature) / 2;
    }

    void output() {
        System.out.println("\nName: " + name );
        System.out.println("Score math: " + scoreMath);
        System.out.println("Score literature: " + scoreLiterature);
        System.out.println("GPA: " + caculateGPA());
    }
}


