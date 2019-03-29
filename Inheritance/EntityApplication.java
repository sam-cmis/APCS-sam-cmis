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
        
        
        Place place = new Place("Somalia");
        Thing thing = new Thing("Scissors");
        Idea idea = new Idea("Sloth");
        
        entities.add(person);
        entities.add(place);
        entities.add(thing);
        entities.add(Idea);
        
        for (Entity e: entities){
            p(e.getName());
            p(e.getAge());
            c
        }
        
    }
    
    public static void p(Object string){
        System.out.println(string);
    }
}