
import java.util.*;
public class Hand
{
    private List<Card> cards;
    
    public Hand(){
        cards = new ArrayList<Card>();
    }
    
    public void addCard(Card card){
        cards.add(card);
    }
    
    public int getValue(){
        int face = 0;
        this. suit = suit;
        if (suits = 1 || 11){
            suits = face;
            face = 10;
            return face;
        } 
        else if (
        //2 - 10 = face 
        //face = 10 points
    }
    
    public String toString(){
        String out = "";
        for(Card card : cards){
            out += card.toString() + " ";
        }
        return out;
    }
}