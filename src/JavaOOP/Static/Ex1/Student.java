package JavaOOP.Static.Ex1;

public class Student {
    private int id;
    private String name;
    private double score;

    static int studentCount = 0; //dùng chung

    public Student() {
        studentCount++;  // tăng lên 1 đối tượng
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
        studentCount++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(double score) {
        this.score = score;
    }


    public void output() {
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Quantity: " + studentCount);
    }


}
