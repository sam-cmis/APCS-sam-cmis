import java.util. *;
public class Game
{
    private Deck deck;
    private List<Player> players;
    private Player dealer;
    private int x = 0;
    public Game(){
        deck = new Deck(5);
        players = new ArrayList<Player>();
        dealer = new Player("Dealer", 5000);

    }

    public void addPlayer(){
        Player newPlayer = new Player("Player"+players);
        players.add(newPlayer);
    }

    public void summary(){
        System.out.println("Summary\n=====");
        System.out.println(dealer);
        for(Player player: players){
            System.out.println(player);
        }
    }

    public void setup(){
         = 
        //dealer setup
        //hand setup
        //player setup
    }
}
