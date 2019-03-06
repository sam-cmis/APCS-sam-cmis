public class cardapplication2
{
    public static void main(String[] args){
        int[] a = new int[10];
        Card[] deck = new Card[52];
        System.out.println(deck);
        int d = 0;
        for (int x = 0; x < deck.length; x++){
            for (int y = 0; y < deck.length-1; y++){
                deck[d] = new Card(suit, rank);
                d++;
            }
        }
        
        for (Card card : deck){
            System.out.println(card);
        }
        
        Hand hand = new Hand();
        for(int i = 0; i < 2; i++){
            hand.addCard(deck[
        }
    }
}