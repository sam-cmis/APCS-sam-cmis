public class Entity{
    private String name;
    
    public Entity(String name){
        this.name = name;
    }

    public void changename(String newname){
        this.name = newname;
    }
    
    public String getname(){
        return name;
    }
    
    public void setAge(int newAge){
        if (newAge <= 150){
            super.setAge(newAge);
        }
    }
    
    public String toString(){
        return String.format("%s:%s:%s", super.toString(), name, "Entity");
    }
}