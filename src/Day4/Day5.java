package Day4;

public class Day5 {
    public static void main(String[] args) {
        double a = 2;
        double b = 3;
        double z = 4;

        double total = calculateSum(a, b);
        total = calculateSum(total, z);

        System.out.println("Total = " + total);
    }

    public static double calculateSum(double a, double b) {
        double sum = a + b;
        return sum;
    }
}
