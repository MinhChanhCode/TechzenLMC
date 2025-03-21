package JavaCore.Day2;

import java.util.Scanner;

public class NumberDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();

        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();


        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Số ngày trong tháng " + month + " là: 30 ngày");
        } else if (month == 2) {
            if (year % 400 == 0) {
                System.out.println("Năm " + year + " là năm nhuận có 29 ngày.");
            }else {
                System.out.println("Năm " + year + "là năm không nhuận có 28 ngày.");
            }
        } else {
            System.out.println("Số ngày trong tháng " + month + " là: 31 ngày");
        }
    }
}
