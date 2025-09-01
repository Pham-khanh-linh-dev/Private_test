package Task.Task1;

import java.util.HashSet;

public class Student{
    private int id;
    private String name;
    private int age;
    private HashSet<String> email;

    public Student(int id, String name, int age, HashSet<String> email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = (email != null) ? email : new HashSet<String>();
    }
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setEmail(String emails){
        this.email.add(emails);
    }
    public HashSet<String> getEmail(){
        return this.email;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", email=" + email + "}";
    }

}