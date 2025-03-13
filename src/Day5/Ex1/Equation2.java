package Day5.Ex1;

public class Equation2 {

    public static void main(String[] args) {
        solveQuadraticEquation(1, -3, 2);
        solveQuadraticEquation(1, 2, 1);
        solveQuadraticEquation(1, 0, 1);
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            solveLinearEquation(b, c);
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Nghiệm kép: x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }

    public static void solveLinearEquation(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
//            System.out.println(b == 0 ? "Phương trình vô số nghiệm." : "Phương trình vô nghiệm.");
        } else {
            System.out.println("Nghiệm: x = " + (-b / a));
        }
    }


}

