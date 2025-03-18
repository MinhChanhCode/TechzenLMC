package Day4;

import java.util.Scanner;

public class Money24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount the customer gives: ");
        int guestMoney = scanner.nextInt();

        System.out.print("Enter the item amount: ");
        int itemMoney = scanner.nextInt();

        if (guestMoney < itemMoney) {
            System.out.println("The amount the customer gave was not enough to pay.");
            return;
        }

        int change = guestMoney - itemMoney;

        System.out.println("Change amount: " + change);

        for (int i = 2; i >= 0; i--) {
            int coefficient = (int) Math.pow(10, i);

            int denomination = 5000 * coefficient;
            if (change >= denomination) {
                System.out.printf("%d sheet %d\n", change / denomination, denomination);
                change %= denomination;
            }

            denomination = 2000 * coefficient;
            if (change >= denomination) {
                System.out.printf("%d sheet %d\n", change / denomination, denomination);
                change %= denomination;
            }

            denomination = 1000 * coefficient;
            if (change >= denomination) {
                System.out.printf("%d sheet %d\n", change / denomination, denomination);
                change %= denomination;
            }

        }
    }
}
