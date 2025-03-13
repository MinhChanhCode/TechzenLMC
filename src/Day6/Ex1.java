package Day6;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String str = "Hello world!";

        //a
        String world = str.substring(6);
        System.out.println("a. " + world);

        //b
        String replaced = str.replace('o', 'f');
        System.out.println("b. " + replaced);

        //c
        long countL = str.chars().filter(ch -> ch == 'l').count();
        System.out.println("c. " + countL);

        //d.
        int firstL = str.indexOf('l');
        int lastL = str.lastIndexOf('l');
        System.out.println("d. First: " + firstL + ", Last: " + lastL);

        //e.
        String noSpace = str.replace(" ", "");
        System.out.println("e. " + noSpace);

        String trimmed = str.trim();
        System.out.println("f. " + trimmed);

        // g.
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("g. " + reversed);

        // h.
        String newStr = "SQC " + str;
        System.out.println("h. " + newStr);

        // i.
        String upperS = newStr.replace('S', 'S');
        String lowerS = newStr.replace('S', 's');
        System.out.println("i. In hoa: " + upperS);
        System.out.println("   In thường: " + lowerS);

        // j.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.print("Enter m: ");
        int m = scanner.nextInt();

        if (n >= 0 && m <= str.length() && n < m) {
            String substring = str.substring(n, m);
            System.out.println("j. " + substring);
        } else {
            System.out.println("j. Chỉ số không hợp lệ!");
        }
        scanner.close();
    }
}