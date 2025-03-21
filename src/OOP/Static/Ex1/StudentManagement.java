package OOP.Static.Ex1;

public class StudentManagement {
    public static void main(String[] args) {
        Student student = new Student(1, "Lê Minh Chánh", 10 );
        Student student1 = new Student(2, "LMC", 10);
        student.output();
        student1.output();
    }
}
