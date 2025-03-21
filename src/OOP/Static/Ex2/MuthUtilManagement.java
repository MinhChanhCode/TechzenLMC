package OOP.Static.Ex2;

public class MuthUtilManagement {
    public static void main(String[] args) {
        double number = 10;
        double number1 = 8;

        double sum = MathUtil.add(number, number1);
        double different = MathUtil.subtract(number, number1);
        double product = MathUtil.multiply(number, number1);
        double quotient = MathUtil.divide(number, number1);


        System.out.println("Sum = " + sum);
        System.out.println("Different is = " + different);
        System.out.println("Product = " + product);
        System.out.println("Quotient = " + quotient);
    }
}
