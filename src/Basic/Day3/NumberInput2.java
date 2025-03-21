package Basic.Day3;

import java.util.Scanner;

public class NumberInput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = scanner.nextInt();

        for (int i=1; i<=n; i+=2){
                System.out.print(i + "   ");
            }
        }
    }



