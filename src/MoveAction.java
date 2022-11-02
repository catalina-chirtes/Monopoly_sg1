public class MoveAction implements Action{
    private PaymentAction paymentAction=new PaymentAction();
    public void move(Player player, int dice_roll, Player Bank) {
        player.setDice_roll(dice_roll);
        player.setPosition(player.getPosition() + dice_roll);
        if(player.getPosition() > 39){
            player.setPosition(player.getPosition() - 40);
            player.setMoney(player.getMoney() + 200);
            Bank.setMoney(Bank.getMoney() - 200);
        }
        od.print_position(player, id.getSquares());
    }
    public Action apply(Player player) {
        if ((board.squares[player.getPosition()]) instanceof Property)
            return paymentAction;
        return null;
    }
}
