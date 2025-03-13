package Day5;

import java.util.Scanner;

public class Staff {
    static String name;
    static int age;
    static String gender;
    static double salary;
    static double gpa;

    public static void main(String[] args) {
        inputStaff();
        outputStaff();
    }

    public static void inputStaff() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter staff:");

        System.out.print("Enter name: ");
        name = scanner.nextLine();

        System.out.print("Enter age: ");
        age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter gender: ");
        gender = scanner.nextLine();

        System.out.print("Enter salary: ");
        salary = Double.parseDouble(scanner.nextLine());

        System.out.print("Enter GPA: ");
        gpa = Double.parseDouble(scanner.nextLine());
    }

    public static void outputStaff() {
        System.out.println("Information staff: ");
        System.out.println("Name staff: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
        System.out.println("GPA: " + gpa);
    }
}
