public class Studentapplication{

    private double GPA = 3.99;
    private boolean ishesmart = false;
    private String name = "Daniel";
    private String lastname = "Oh";

    public Studentapplication(){
        this. GPA = 3.99;
        this. ishesmart = false;
        this. name = "Daniel";
        this. lastname ="Oh";
    }

    public Studentapplication(double field1, boolean field2, String field3, String field4){
        this();
        this. GPA = field1;
        this. ishesmart = field2;
        this. name = field3;
        this. lastname = field4;
    }

    public String toString(){
        return String.format("name: %n\nlastname: %n\nGPA: %f\nishesmart: %s\n", name, GPA, ishesmart);
    }

}