package JavaCore.Day5;

import java.util.Scanner;

public class Staff_n8 {

    static String name1, name2, name3, name4, name5;
    static int age1, age2, age3, age4, age5;
    static String gender1, gender2, gender3, gender4, gender5;
    static double salary1, salary2, salary3, salary4, salary5;
    static double gpa1, gpa2, gpa3, gpa4, gpa5;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        inputEmployee1();
        System.out.print("Do you want to import more employees? (Yes/No): ");
        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("yes")) {
            inputEmployee2();
            System.out.print("Do you want to import more employees? (Yes/No): ");
            answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("yes")) {
                inputEmployee3();
                System.out.print("Do you want to import more employees? (Yes/No): ");
                answer = scanner.nextLine().trim().toLowerCase();

                if (answer.equals("yes")) {
                    inputEmployee4();
                    System.out.print("Do you want to import more employees? (Yes/No): ");
                    answer = scanner.nextLine().trim().toLowerCase();

                    if (answer.equals("yes")) {
                        inputEmployee5();
                        outputEmployee1();
                        outputEmployee2();
                        outputEmployee3();
                        outputEmployee4();
                        outputEmployee5();
                    } else {
                        outputEmployee1();
                        outputEmployee2();
                        outputEmployee3();
                        outputEmployee4();
                    }
                } else {
                    outputEmployee1();
                    outputEmployee2();
                    outputEmployee3();
                }
            } else {
                outputEmployee1();
                outputEmployee2();
            }
        } else {
            outputEmployee1();
        }
    }


    public static void inputEmployee1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee 1");

        System.out.print("Enter name : ");
        name1 = scanner.nextLine();

        System.out.print("Enter age : ");
        age1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter gender : ");
        gender1 = scanner.nextLine();

        System.out.print("Enter salary : ");
        salary1 = scanner.nextDouble();

        System.out.print("Enter GPT graduate : ");
        gpa1 = scanner.nextDouble();
    }

    public static void inputEmployee2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee 2");

        System.out.print("Enter name : ");
        name2 = scanner.nextLine();

        System.out.print("Enter age : ");
        age2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter gender : ");
        gender2 = scanner.nextLine();

        System.out.print("Enter salary : ");
        salary2 = scanner.nextDouble();

        System.out.print("Enter GPA graduate: ");
        gpa2 = scanner.nextDouble();
    }

    public static void inputEmployee3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee 3");

        System.out.print("Enter name : ");
        name3 = scanner.nextLine();

        System.out.print("Enter age : ");
        age3 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter gender : ");
        gender3 = scanner.nextLine();

        System.out.print("Enter salary : ");
        salary3 = scanner.nextDouble();

        System.out.print("Enter GPA graduate : ");
        gpa3 = scanner.nextDouble();
    }

    public static void inputEmployee4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee 4");

        System.out.print("Enter name : ");
        name4 = scanner.nextLine();

        System.out.print("Enter age : ");
        age4 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter gender : ");
        gender4 = scanner.nextLine();

        System.out.print("Enter salary : ");
        salary4 = scanner.nextDouble();

        System.out.print("Enter GPA graduate : ");
        gpa4 = scanner.nextDouble();
    }

    public static void inputEmployee5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee 5");

        System.out.print("Enter name : ");
        name5 = scanner.nextLine();

        System.out.print("Enter age : ");
        age5 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter gender : ");
        gender5 = scanner.nextLine();

        System.out.print("Enter salary : ");
        salary5 = scanner.nextDouble();

        System.out.print("Enter GPA graduate : ");
        gpa5 = scanner.nextDouble();
    }

    // Xuất thông tin
    public static void outputEmployee1() {
        System.out.println("\nInformation employee 1 :");
        System.out.println("Name: " + name1);
        System.out.println("Age: " + age1);
        System.out.println("Gender: " + gender1);
        System.out.println("Salary: " + salary1);
        System.out.println("GPA: " + gpa1);
    }

    public static void outputEmployee2() {
        System.out.println("\nInformation employee 2 :");
        System.out.println("Name: " + name2);
        System.out.println("Age: " + age2);
        System.out.println("Gender: " + gender2);
        System.out.println("Salary: " + salary2);
        System.out.println("GPA: " + gpa2);
    }

    public static void outputEmployee3() {
        System.out.println("\nEnter employee 3 :");
        System.out.println("Name: " + name3);
        System.out.println("Age: " + age3);
        System.out.println("Gender: " + gender3);
        System.out.println("Salary: " + salary3);
        System.out.println("GPA: " + gpa3);
    }

    public static void outputEmployee4() {
        System.out.println("\nInformation employee 4 :");
        System.out.println("Name: " + name4);
        System.out.println("Age: " + age4);
        System.out.println("Gender: " + gender4);
        System.out.println("Salary: " + salary4);
        System.out.println("GPA: " + gpa4);
    }

    public static void outputEmployee5() {
        System.out.println("\nInformation employee 5 :");
        System.out.println("Name: " + name5);
        System.out.println("Age: " + age5);
        System.out.println("Gender: " + gender5);
        System.out.println("Salary: " + salary5);
        System.out.println("GPA: " + gpa5);
    }
}
