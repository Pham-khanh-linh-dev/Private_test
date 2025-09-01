package Interface;
public class Teacher implements Person{
    private int id;
    private String name;
    private String subject;

    public Teacher(int id, String name, String subject){
        this.id = id;
        this.name  = name;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I teach " + subject);
    }

}
