package JavaCore.Day1;

import java.util.Scanner;

public class Tax_VAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name product: ");
        String product = scanner.nextLine();

        System.out.print("Enter quantity: ");
        double quantity = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        double totalProduct = quantity * price;
        double taxVAT = totalProduct * 0.1;

        System.out.println("Total is: " + totalProduct);
        System.out.println("Tax VAT is: " + taxVAT);



    }
}
