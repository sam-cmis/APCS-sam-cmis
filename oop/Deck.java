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
        for (int x = 0; x < cards.size; x++){
            int x = ((int)(Math.random() * cards.size));
            int y = ((int)(Math.random() * cards.size));
            cards c1 = cards.set(x);
            cards c2 = cards.get();
            cards.set(x,c1);
            cards.get(y,c );
        }
        //cards.set(object. index);
        //cards.get(index);
    }
}