package OOP.Test;

import java.util.Scanner;

public class StaticTest {

    private int id = 0;
    private String name;


    static int Id = 0;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();

        this.id = Id++;
    }


    public void output() {
        System.out.println("Id" + Id);
        System.out.println("Name: " + name);

    }
}
