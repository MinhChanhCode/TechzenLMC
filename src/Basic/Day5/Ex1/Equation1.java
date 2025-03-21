package Basic.Day5.Ex1;

public class Equation1 {

    public static void levelOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = -b / a;

            System.out.println("Phương trình có nghiệm là : " + x);
        }
    }

    public static void main(String[] args) {
        levelOne(2, -4);
        levelOne(0, 5);
        levelOne(0, 0);
    }
}
