public class cardapplication2
{
    public static void main(String[] args){
        int[] a = new int[10];
        Card[] deck = new Card[52];
        System.out.println(deck);
        int d = 0;
        for (int rank = 0; rank < 13; rank++){
            for (int suit = 0; suit < 4; suit++){
                deck[d] = new Card(suit, rank);
                d++;
            }
        }
        
        for (Card card : deck){
            System.out.println(card);
        }
        
        Hand hand = new Hand();
        for(int i = 0; i < 2; i++){
            hand.addCard(deck[(int)(Math.random() * 52)]);
        }
    }
}