package Day2;

import java.util.Scanner;

public class Equation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextInt();

        System.out.print("Nhập b: ");
        double b = scanner.nextInt();



        if(a == 0){
            if (b==0){
                System.out.println("Phương trình vô số nghiệm.");
            }else {
                System.out.println("Phương trình vô nghiệm.");
            }
        }else {
            double i = -b/a;
            System.out.println("Phương trình có nghiệm là: " + i);
        }

    }
}
