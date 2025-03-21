package Basic.Day2;

import java.util.Scanner;

public class TranslateEnglish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = Integer.parseInt(scanner.nextLine());


        //Use switch case
//        switch (number) {
//            case 1:
//                System.out.println(number + " : One");
//                break;
//            case 2:
//                System.out.println(number + " : Two");
//                break;
//            case 3:
//                System.out.println(number + " : Three");
//                break;
//            case 4:
//                System.out.println(number + " : Four");
//                break;
//            case 5:
//                System.out.println(number + " : Five");
//                break;
//            case 6:
//                System.out.println(number + " : Six");
//                break;
//            case 7:
//                System.out.println(number + " : Seven");
//                break;
//            case 8:
//                System.out.println(number + " : Eight");
//                break;
//            case 9:
//                System.out.println(number + " : Nine");
//                break;
//            case 10:
//                System.out.println(number + " : Ten");
//                break;
//            default:
//                System.out.println(number + " : Error");
//        }

        //Use if else
        if (number == 1) {
            System.out.println(number + " : One");
        }
        else if (number == 2) {
            System.out.println(number + " : Two");
        }
        else if (number == 3) {
            System.out.println(number + " : Three");
        }
        else if (number == 4) {
            System.out.println(number + " : Four");
        }
        else if (number == 5) {
            System.out.println(number + " : Five");
        }
        else if (number == 6) {
            System.out.println(number + " : Six");
        }
        else if (number == 7) {
            System.out.println(number + " : Seven");
        }
        else if (number == 8) {
            System.out.println(number + " : Eight");
        }
        else if (number == 9) {
            System.out.println(number + " : Nine");
        }
        else if (number == 10) {
            System.out.println(number + " : Ten");
        }
        else {
            System.out.println(number + " : Error");
        }
    }
}
