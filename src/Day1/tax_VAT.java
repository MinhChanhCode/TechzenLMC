package Day1;

import java.util.Scanner;

public class tax_VAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name product: ");
        String product = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter price: ");
        int price = scanner.nextInt();
        scanner.nextLine();

        int totalProduct = quantity * price;
        double taxVAT = totalProduct * 0.1;

        System.out.println("Total is: " + totalProduct);
        System.out.println("Tax VAT is: " + taxVAT);



    }
}
