import java.util.*;
public class School
{
    private School school;
    private List<Student> students;
    private String name; 
    private int student;
    
    public School (){
        students = new ArrayList<Student>();
        this.name = name;
        //made name
    }

    public void addStudent(Student student){
        students.add(student); 
    }

    public String getName(){
       return name;
    }

    public int getStudents(){
        return student;
    }
    
    public String toString(){
        String out = ""; 
        for (Student student : students){
            out += student.toString() + " "; 
        }
        return out; 
    }
}