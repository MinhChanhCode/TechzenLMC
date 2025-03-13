package Day6;

public class Ex2 {
    public static void main(String[] args) {
        //a.
        String str = "123";
        int number1 = Integer.parseInt(str);
        System.out.println(str);

        //b
        int num = 456;
        String str1 = String.valueOf(num);
        System.out.println(str1);

        //c
        String longStr = "9876543210";
        long longNum1 = Long.parseLong(longStr);
        long longNum2 = Long.valueOf(longStr);

        System.out.println(longNum1);
        System.out.println(longNum2);


    }
}
