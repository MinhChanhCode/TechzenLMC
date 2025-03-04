package Day1;

import java.util.Scanner;

import static java.lang.System.*;


public class Day1_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Scanner in Line/int

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();
//        scanner.nextLine(); // đọc bỏ dòng thừa
//        int age = Integer.parseInt(scanner.nextLine()); //parseInt : change Int -> line

        System.out.print("Study school: ");
        String school = scanner.nextLine();


        System.out.println("Name is :" + name);
        System.out.println("Age is: " + age);
        System.out.println("School is: " + school);




    }
}