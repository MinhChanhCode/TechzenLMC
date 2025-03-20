package Contructor.Ex3;

public class main {
    public static void main(String[] args) {
        Student student = new Student(1, "Lê Minh Chánh", 10);

        System.out.println("First information: ");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Score: " + student.getScore());

        student.setName("Lê Minh Chánh");
        student.setScore(10);

        System.out.println("\nUpdate information: ");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Score: " + student.getScore());

        student.setName(" ");
        student.setScore(11);
    }
}
