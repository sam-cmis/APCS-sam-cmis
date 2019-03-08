import java.util.*;
public class Deck
{
    private List <Card> cards;
    public Deck(int nDecks){
        cards = new ArrayList<Card>();
        cards.add(new Card(2, 2));
        int d =0;
        for (int rank = 0; rank < 13; rank++){
            for (int suit = 0; suit < 4; suit++){
                cards.add(suit, rank);
            }
        }
    }
    
    public int nCards(){
        return cards.size();
    }
    
    public Card draw(){
        int last = cards.size() -1;
        return cards.remove(last);
        
    }
    
    public void shuffle(){
        int x = 0;
        for (int rank = 0; rank < 13; rank++){
            for (int suit = 0; suit < 4; suit++){
                
                
                cards.set(
            }
        }
        
        //cards.set(object. index);
        // cards.get(index);
    }
}