package Contructor.Ex1;

public class main {
    public static void main(String[] args) {
        Phanso a = new Phanso();
        a.output();

        Phanso b = new Phanso(1, 2);
        b.output();

        Phanso c = new Phanso(3);
        c.output();

        Phanso d = new Phanso(-6, -2);
        d.output();

        Phanso e = new Phanso(3, -1);
        e.output();

        Phanso f = e.copy();
        f.cong(100);
        e.output();
        f.output();

    }
}
