public class cardapplication
{
    public static void main(String[] args){
        Game game = new Game();
        game.addPlayer();
        game.addPlayer();
        game.addPlayer();
        int round = 1;
        while(game.playerfunds() > 0){
            System.out.format("+----------+\n|Round %d");
            game.setup();
            //game.playRound();
            game.evaluate();
            game.summary ();
            
        }
        

    }
} 