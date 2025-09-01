package Task.Task1;

import java.util.*;

public interface ManagementService {
    public void addStudents(List<Student> students, Student student);
    public void removeStudentsById(List<Student> students, int id);
    public List<Student> findStudentByName(List<Student> students, String name);
    public List<Student> getAllStudents(List<Student> students);
    public void addEmail(List<Student> students, int id, String email);
    public HashSet<String> getEmailById(List<Student> students, int id);
    public Boolean isEmailExists(List<Student> students, String email);

}
