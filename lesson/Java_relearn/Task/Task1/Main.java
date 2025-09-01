package Task.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List<Student> listStudent = new ArrayList<>();
        // listStudent.add(new Student(1, "Alice", 20));
        // listStudent.add(new Student(2, "Bob", 22));
        // listStudent.add(new Student(3, "Charlie", 21));

        // StudentManagement sm = new StudentManagement();
        // sm.addStudents(listStudent, new Student(4, "David", 23));
        // sm.removeStudentsById(listStudent, 2);
        // List<Student> foundStudents = sm.findStudentByName(listStudent, "Alice");
        // System.out.println("Found students: " + foundStudents);
        // List<Student> allStudents = sm.getAllStudents(listStudent);
        //  System.out.println("All students: " + allStudents);

        StudentManagement sm = new StudentManagement();
        List<Student> listStudent = new ArrayList<>();

        sm.addStudents(listStudent, new Student(1, "Alice", 20, null));
        sm.addStudents(listStudent, new Student(2, "Bob", 22, null));
        sm.addStudents(listStudent, new Student(3, "Charlie", 21, null));

        System.out.println("Danh sách ban đầu:");
        System.out.println(sm.getAllStudents(listStudent));

        sm.removeStudentsById(listStudent, 2);
        System.out.println("Sau khi xóa Bob:");
        System.out.println(sm.getAllStudents(listStudent));

        System.out.println("Tìm Charlie:");
        System.out.println(sm.findStudentByName(listStudent, "Charlie"));
        System.out.println("////////////////////////////////////////////////");
        System.out.println("////////////////////////////////////////////////");
        sm.addEmail(listStudent, 3, "abc.com");
        System.out.println(sm.getAllStudents(listStudent));
        sm.addEmail(listStudent, 3, "xyz.com");
        System.out.println(sm.getAllStudents(listStudent));
        System.out.println("Email của Charlie: " + sm.getEmailById(listStudent, 3));
        System.out.println("Kiểm tra email abc.com tồn tại: " + sm.isEmailExists(listStudent, "abc.com"));
        System.out.println("Kiểm tra email test.com tồn tại: " + sm.isEmailExists(listStudent, "test.com"));    
    }
}
