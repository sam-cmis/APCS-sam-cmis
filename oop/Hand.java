import java.util.*;
public class Hand
{
    private List<Card> cards;
    private int suit; 
    private int rank; 
    private boolean faceUp;
    
    public Hand(){
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card){
        cards.add(card);
    }

    public int getValue(){
        int face = 0;
        if (suit < 11){
            if (suit > 11){
                face = 10;
            }
        }
        if (suit == 1){
            if (suit == 11){
                System.out.println("Ace");
            }
        }
        return face;
    }

    public String toString(){
        String out = "";
        for(Card card : cards){
            out += card.toString() + " ";
        }
        return out;
    }
}