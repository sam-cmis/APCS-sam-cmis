import java.util.*;
 class Student
{
    private List<Course> course;
    private String name; 
    private int grade; 
    private double avgGPA;
    

    public Student(String name, int grade){
        this.name = name; 
        this.grade = grade; 
    }

    public String toString(){
        String out = String.format("%s%s", name, grade);
        return out;
    }
    
    public String addCourse(){
        course = addCourse(course);
    }
    
    public double avgGPA(){
        int x = 0;
        for (School school : avgGPA){
            x += avgGPA() + " "; 
        }
        
    }
}