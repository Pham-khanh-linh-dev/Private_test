package Task.Task1;

import java.util.HashSet;
import java.util.List;

public class StudentManagement implements ManagementService {
    @Override
    public void addStudents(List<Student> students, Student s) {
        students.add(s);
    }

    @Override
    public void removeStudentsById(List<Student> students, int id) {
        students.removeIf(student -> student.getId() == id);
    }
    @Override
    public List<Student> findStudentByName(List<Student> students, String name) {
        return students.stream()
                .filter(student -> student.getName().equalsIgnoreCase(name))
                .toList();
    }

    @Override
    public List<Student> getAllStudents(List<Student> students) {
        return students;
    }

    @Override
    public void addEmail(List<Student> students, int id, String email) {
       for(Student student : students){
            if(student.getId() == id){
                student.setEmail(email);
                break;
            }
        }
        students.stream().filter(s -> s.getId() == id).findFirst().ifPresent(s -> s.getEmail().add(email));
    }

    @Override
    public HashSet<String> getEmailById(List<Student> students, int id) {
        for(Student student : students){
            if(student.getId() == id){
                return student.getEmail();
            }
        }
        return null;
    }

    @Override
    public Boolean isEmailExists(List<Student> students, String email) {
        for(Student student : students){
            if(student.getEmail().contains(email)){
                return true;
            }
        }
        return false;
    }
}
