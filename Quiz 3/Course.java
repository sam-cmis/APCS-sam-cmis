import java.util.*;
public class Course{
    private String courseName;

    private double grade;
    
    public Course (String courseName, int grade){
        this.courseName = courseName;
        this.grade = grade;
    } 
    
   
    public String toString(){
        String out = ""; 
        for (GPA gPA : gPA){
            out += gPA.toString() + " "; 
        }
        return out; 
    }
    //course names
    //average gpa
    


}