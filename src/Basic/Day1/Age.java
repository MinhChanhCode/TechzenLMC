package Basic.Day1;

import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year : ");
        int year = scanner.nextInt();

        int age = Year.now().getValue() - year;


        System.out.println("Age : " + age);

    }

}
