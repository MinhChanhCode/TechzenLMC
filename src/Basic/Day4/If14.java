package Basic.Day4;

import java.util.Scanner;

public class If14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int number = 10; number <= 99; number++) {
            int tensDigit = number / 10;
            int onesDigit = number % 10;


            int sum = tensDigit + onesDigit;
            int product = tensDigit * onesDigit;

            if (product == 2 * sum) {
                System.out.println(number);
            }
        }
    }
}
