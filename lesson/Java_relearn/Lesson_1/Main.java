import Class.Student;
import Interface.Teacher;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(1, "Alice");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());

        Teacher teacher = new Teacher(101, "Mr. Smith", "Mathematics");
        System.out.println("Teacher Name: " + teacher.getName());
        System.out.println("Teacher Subject: " + teacher.getSubject());
        System.out.println("Teacher says: ");
        teacher.sayHello();
    }
}