public class OutputDevice {
    void writeMessage(){
        System.out.println("Hello and welcome to MONOPOLY.");
        System.out.println("Today's players are:\n");
    }

    void print_round_nr(int round){
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("ROUND " + round);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
    }

    void print_name(Player player){
        System.out.println("Player: " + player.getName());
    }

    void print_roll_nr(Player player){
        System.out.println("Number on dice: " + player.getDice_roll());
    }

    void print_position(Player player, Square[] positions){
        System.out.println("Position on board: " + positions[player.getPosition()].getName());
        if (positions[player.getPosition()] instanceof Property) {
            if (((Property) positions[player.getPosition()]).isOwned() == true && ((Property) positions[player.getPosition()]).getOwner_name().equals(player.getName()) == false)
                System.out.println("Player " + player.getName() + " payed property tax");
            else
                System.out.println("Player " + player.getName() + " owns this property");
        }
    }

    void print_money(Player player){
        System.out.println("Money: " + player.getMoney() + "$\n");
    }

    void print_finish(){
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("FINISH");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
    }

    void print_winner(Player player){
        this.print_finish();
        System.out.println("The winner is " + "\033[0;1m" + player.getName() + "\u001B[0m" + " ! HURRAY!!");
    }

    void print_bank(Board board){
        System.out.println("Money left in bank: " + board.Bank + "$");
    }
}
