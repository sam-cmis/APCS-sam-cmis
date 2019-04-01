import java.util.*;
public class EntityApplication{
    public static void main(String[] args){
        Entity e1 = new Entity("entity 1");
        p(e1);
        Thing t1 = new Thing("Thing1");
        t1.setValue(1);
        p(t1);
        Person p1 = new Person("Person1");
        p1.setAge(1);
        p(p1);
        Place pl1 = new Place("Place1");
        pl1.setPopulation(1);
        p(pl1);
        Idea i1 = new Idea("Idea1");
        i1.setPopularity(1);
        p(i1);
        G8mer g1 = new G8mer("Gamer1");
        g1.setScore(5.5);
        p(g1);
        Mall m1 = new Mall("Mall1");
        m1.setVisitors(6974);
        p(m1);
        
        
    }
    
    public static void p(Object string){
        System.out.println(string);
    }
}