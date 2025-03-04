package Day1;

import java.util.Scanner;

public class GPA_Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name student is: ");
        String name = scanner.nextLine();

        System.out.print("Score Math is: ");
        int sMath = scanner.nextInt();

        System.out.print("Score Physics is: ");
        int sPhysics = scanner.nextInt();

        System.out.print("Score Chemistry is: ");
        int sChemistry = scanner.nextInt();

        double GPA = (double) (sMath + sMath + sPhysics) / 3;

        System.out.println("Student : " + name);
        System.out.println("GPA is: " + GPA);

    }
}
