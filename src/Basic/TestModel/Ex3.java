package Basic.TestModel;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String Str = scanner.nextLine();

        System.out.println(UpperCase(Str));
    }

    public static String UpperCase(String str) {
        int count = 0;

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }

        if (count > 0) {
            return "Number character uppercase in string: " + count;
        } else {
            return "No string uppercase";
        }
    }
}
