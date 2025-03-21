package JavaCore.Day1;

public class Variable_a_i_j {
    public static void main(String[] args) {


        int i = 1;
        int j = 1;
        int a = 10;

        System.out.println("a: " + (i++ + j++));
        System.out.println("b: " + (i++ + ++j));
        System.out.println("c: " + (++i + j++));
        System.out.println("d: " + (++i + ++j));
        System.out.println("e: " + (i++ + j++ + i++ + j++));
        System.out.println("f: " + (++i + ++j + i++ + j++));
        System.out.println("g: " + (i++ + ++i - i-- - --i));
        System.out.println("h: " + (a++ + ++a));

    }
}
