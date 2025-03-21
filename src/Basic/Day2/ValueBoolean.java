package Basic.Day2;

public class ValueBoolean {
    public static void main(String[] args) {

        boolean a = true && false;

        boolean b = (3 > 100) || (25 % 5 == 0);

        boolean c = a && b;

        boolean d = !a || b;

        System.out.println("Value a: " + a);
        System.out.println("Value b: " + b);
        System.out.println("Value c: " + c);
        System.out.println("Value d: " + d);

    }
}
