package JavaCore.Day5;

import java.util.Scanner;

public class Staff_n {

    static String name1, name2, name3, name4, name5;
    static int age1, age2, age3, age4, age5;
    static String position1, position2, position3, position4, position5;
    static double salary1, salary2, salary3, salary4, salary5;
    static String address1, address2, address3, address4, address5;

    static Scanner scanner = new Scanner(System.in);


    public static void inputEmployee1() {


        System.out.println("\nEnter information employee 1:");

        System.out.print("Enter name: ");
        name1 = scanner.nextLine();

        System.out.print("Enter age: ");
        age1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter position: ");
        position1 = scanner.nextLine();

        System.out.print("Enter salary: ");
        salary1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter address: ");
        address1 = scanner.nextLine();
    }

    public static void inputEmployee2() {
        System.out.println("\nEnter information employee 2:");

        System.out.print("Enter name: ");
        name2 = scanner.nextLine();

        System.out.print("Enter age: ");
        age2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter position: ");
        position2 = scanner.nextLine();

        System.out.print("Enter salary: ");
        salary2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter address: ");
        address2 = scanner.nextLine();
    }

    public static void inputEmployee3() {
        System.out.println("\nEnter information employee 3:");

        System.out.print("Enter name: ");
        name3 = scanner.nextLine();

        System.out.print("Enter age: ");
        age3 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter position: ");
        position3 = scanner.nextLine();

        System.out.print("Enter salary: ");
        salary3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter address: ");
        address3 = scanner.nextLine();
    }

    public static void inputEmployee4() {
        System.out.println("\nEnter information employee 4:");

        System.out.print("Enter name: ");
        name4 = scanner.nextLine();

        System.out.print("Enter age: ");
        age4 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter position: ");
        position4 = scanner.nextLine();

        System.out.print("Enter salary: ");
        salary4 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter address: ");
        address4 = scanner.nextLine();
    }

    public static void inputEmployee5() {
        System.out.println("\nEnter information employee 5:");

        System.out.print("Enter name: ");
        name5 = scanner.nextLine();

        System.out.print("Enter age: ");
        age5 = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter position: ");
        position5 = scanner.nextLine();

        System.out.print("Enter salary: ");
        salary5 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter address: ");
        address5 = scanner.nextLine();
    }


    public static void outputEmployee1() {
        System.out.println("\nInformation employee: ");
        System.out.println("Name: " + name1);
        System.out.println("Age: " + age1);
        System.out.println("Position: " + position1);
        System.out.println("Salary: " + salary1);
        System.out.println("Address: " + address1);
    }

    public static void outputEmployee2() {
        System.out.println("\nInformation employee: ");
        System.out.println("Name: " + name2);
        System.out.println("Age: " + age2);
        System.out.println("Position: " + position2);
        System.out.println("Salary: " + salary2);
        System.out.println("Address: " + address2);
    }

    public static void outputEmployee3() {
        System.out.println("\nInformation employee 3: ");
        System.out.println("Name: " + name3);
        System.out.println("Age: " + age3);
        System.out.println("Position: " + position3);
        System.out.println("Salary: " + salary3);
        System.out.println("Address: " + address3);
    }

    public static void outputEmployee4() {
        System.out.println("\nInformation employee: ");
        System.out.println("Name: " + name4);
        System.out.println("Age: " + age4);
        System.out.println("Position: " + position4);
        System.out.println("Salary: " + salary4);
        System.out.println("Address: " + address4);
    }

    public static void outputEmployee5() {
        System.out.println("\nInformation employee: ");
        System.out.println("Name: " + name5);
        System.out.println("Age: " + age5);
        System.out.println("Position: " + position5);
        System.out.println("Salary: " + salary5);
        System.out.println("Address: " + address5);
    }

    public static void main(String[] args) {
        int n;

        do {
            System.out.print("\nEnter number employee ( Max = 5): ");
            n = scanner.nextInt();
            scanner.nextLine();

            if (n < 1 || n > 5) {
                System.out.println("Error!!! Please re-enter !");
            }
        } while (n < 1 || n > 5);

        switch (n) {
            case 5:
                inputEmployee5();
            case 4:
                inputEmployee4();
            case 3:
                inputEmployee3();
            case 2:
                inputEmployee2();
            case 1:
                inputEmployee1();
                break;
            default:
                System.out.println("Error! Invalid employee number.");
        }

        System.out.println("\n======= LIST OF EMPLOYEES =======");
        switch (n) {
            case 5:
                outputEmployee5();
            case 4:
                outputEmployee4();
            case 3:
                outputEmployee3();
            case 2:
                outputEmployee2();
            case 1:
                outputEmployee1();
                break;
            default:
                System.out.println("There are no employees to display.");
        }

    }
}
