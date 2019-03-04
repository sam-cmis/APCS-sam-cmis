public class me
{
    private String intelligence;
    private String name;
    private int age;
    
    public me()
    {
        intelligence = "huh";
        name = "sam";
        age = 17;
    }
    
    public me(String intelligence, String name, int age)
    {
        this.intelligence = intelligence;
        this.intelligence = intelligence;
        this.age = age;
    }
    
    public String introducing()
    {
        return String.format("His intelligence is %s. His name is  %s. He is %d years old\n", intelligence, name, age);
    }
}