public class Application {
    public InputDevice in;
    public OutputDevice out;
    private int players, rounds;
    Application(InputDevice in, OutputDevice out){
        this.in = in;
        this.out = out;
    }
    Player[] playersArr = new Player[10];
    Square[] aux = {};
    Board board = new Board(aux);

    public void initPlayers(){
        for(int i=0;i<getPlayers();i++)
            playersArr[i] = new Player(in.getName());
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    void play_game(){
        in.declare();
        initPlayers();
        Square[] locations;
        locations= in.getPlaces();
        out.writeMessage();
        for(int p=0;p<players;p++)
            out.print_name(playersArr[p]);
        System.out.println();
        for(int i=1;i<=this.rounds;i++){
            out.print_round_nr(i);
            for(int j=0;j<players;j++){
                playersArr[j].move(in.ThrowDice(), board);

                if(locations[playersArr[j].getPosition()] instanceof Property )
                    if(((Property) locations[playersArr[j].getPosition()]).owner==null)
                        ((Property) locations[playersArr[j].getPosition()]).buyProperty(playersArr[j]);
                    else
                        ((Property) locations[playersArr[j].getPosition()]).payTax(playersArr[j]);

                out.print_name(playersArr[j]);
                out.print_roll_nr(playersArr[j]);
                out.print_position(playersArr[j], in.getPlaces());
                out.print_money(playersArr[j]);
                out.print_propery_nb(playersArr[j]);
            }
        }
        this.winner();
    }

    public void winner(){
        double maximum = -1;
        int maximum_prp =-1;
        int position = -1;
        Player winner = new Player("0");
        for(int i=0;i<rounds;i++)
            for(int j=0;j<players;j++)
            {
                if(playersArr[j].getMoney() > maximum ){
                    maximum = playersArr[j].getMoney();
                    maximum_prp= playersArr[j].property_nb;
                    position = playersArr[j].getPosition();
                    winner = playersArr[j];
                }
                else if(playersArr[j].getMoney() == maximum){
                    position = playersArr[j].getPosition();
                    winner = playersArr[j];


                }
            }
        out.print_winner(winner);
        out.print_bank(board);
    }
}
