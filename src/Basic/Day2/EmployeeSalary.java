package Basic.Day2;

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập thâm niên công tác(TNCT): ");
        int TNCT = scanner.nextInt();

        final int basicSalary = 650000;
        double coefficient;


        if (TNCT < 12) {
            coefficient = 1.92;
        } else if (TNCT < 36) {
            coefficient = 2.34;
        } else if (TNCT < 60) {
            coefficient = 3;
        } else {
            coefficient = 4.5;
        }

        double employSalary = coefficient * basicSalary;

        System.out.println("Hệ số lương là : " + coefficient);
        System.out.println("Lương của nhân viên là:  $" + employSalary);


    }
}
