import java.io.Serializable;

public class Course implements Serializable{
    public String name;
    public int studentNumber;

    public Course(String name, int studentNumber) {
        this.name = name;
        this.studentNumber = studentNumber;
    }
}
