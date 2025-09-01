package Collection;
import java.util.*;

import Class.Student;
public class Collection_basic {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Charlie"));

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student(1, "Alice"));
        studentMap.put(2, new Student(2, "Bob"));
        studentMap.put(3, new Student(3, "Charlie"));
    }
    
}
