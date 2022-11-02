public class Application {
    public InputDevice in;
    public OutputDevice out;
    private int players, rounds;
    Application(InputDevice in, OutputDevice out){
        this.in = in;
        this.out = out;
    }
    Player[] playersArr = new Player[10];
    Board board = new Board();
    Player Bank = new Player();


    public void initPlayers(){
        for(int i=0;i<getPlayers();i++)
        {
            playersArr[i] = new Player();
            playersArr[i].setName(in.getName());
        }
        Bank.setName("Bank");
        Bank.setMoney(20580);
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
        out.writeMessage();
        for(int p=0;p<players;p++)
            out.print_name(playersArr[p]);
        System.out.println();
        for(int i=1;i<=this.rounds;i++){
            out.print_round_nr(i);
            for(int j=0;j<players;j++){
                out.print_name(playersArr[j]);
                out.print_roll_nr(playersArr[j]);
                action_on_this_position(playersArr[j], playersArr, board);
                out.print_money(playersArr[j]);
            }
        }
        this.winner();
    }

    public void winner(){
        double maximum = -1;
        int position = -1;
        Player winner = new Player();
        for(int i=0;i<rounds;i++)
            for(int j=0;j<players;j++)
            {
                if(playersArr[j].getMoney() > maximum){
                    maximum = playersArr[j].getMoney();
                    position = playersArr[j].getPosition();
                    winner = playersArr[j];
                }
                else if(playersArr[j].getMoney() == maximum){
                    position = playersArr[j].getPosition();
                    winner = playersArr[j];
                }
            }
        out.print_winner(winner);
        out.print_bank(Bank);
    }
    public void action_on_this_position(Player player, Player[] players, Board board) {
        Action action = new MoveAction();
        ((MoveAction) action).move(player, in.ThrowDice(), Bank);
        Action next_action = action.apply(player);
        while (next_action != null)
        {
            if (next_action instanceof PaymentAction)
            {
                action = new PaymentAction();
                Player payment_receiver = new Player();
                if (((Property) board.squares[player.getPosition()]).isOwned()==false)
                    payment_receiver = Bank;
                else
                    for (Player i: players)
                    {
                        if (i.getName().equals(((Property) board.squares[player.getPosition()]).getOwner_name()))
                        {
                            if ((i.getName()).equals(player.getName()))
                                System.out.println("Player " + player.getName() + " owns this property.");
                            payment_receiver = i;
                            break;
                        }
                    }
                ((PaymentAction) action).payment(player, payment_receiver, ((Property) board.squares[player.getPosition()]));
            }
            next_action = action.apply(player);
        }
    }
}
