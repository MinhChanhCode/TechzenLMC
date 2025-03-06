package Day2;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập thâm niên công tác(TNCT): ");
        int TNCT = scanner.nextInt();

        double basicSalary = 650000;
        double coefficient = 0;


        if (TNCT < 12) {
            coefficient = 1.92;
        } else if (12 <= TNCT && TNCT < 36) {
            coefficient = 2.34;
        } else if (36 <= TNCT && TNCT < 60) {
            coefficient = 3;
        } else if (TNCT >= 60) {
            coefficient = 4.5;
        }

        double employSalary = coefficient * basicSalary;

        System.out.println("Hệ số lương là : " + coefficient);
        System.out.println("Lương của nhân viên là:  $" + employSalary);


    }
}
