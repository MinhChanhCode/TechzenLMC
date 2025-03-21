package OOP.Contructor.Ex3;

public class Student {
    private int id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            System.out.println("Error! Name required");
        } else {
            this.name = name;
        }
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("Error!!! Score in 0 -> 10");
        }
    }
}
