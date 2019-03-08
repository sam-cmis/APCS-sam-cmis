public class cardapplication
{
    public static void main(String[] args){
         Deck deck = new Deck(2);
         for (int y = 0; y < Deck.nCards(); y++){
            System.out.println(draw());
         } 
    }
}