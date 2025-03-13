package Day5.Ex1;

public class CharacterConverter {
    public static void main(String[] args) {
        System.out.println(toLowerCase('A'));
        System.out.println(toLowerCase('a'));
        System.out.println(toLowerCase('Z'));

    }

    public static char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        }
        return ch;
    }
}
