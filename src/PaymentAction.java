public class PaymentAction implements Action{

    public Action apply(Player player) {
        return null;
    }

    public void payment(Player player, Player payment_receiver, Property property) {
        if (player.getMoney()>=property.getPrice())
        {
            payment_receiver.setMoney(payment_receiver.getMoney() + property.getPrice());
            player.setMoney(player.getMoney() - property.getPrice());
            property.setOwner_name(player.getName());
            System.out.println("Player " + player.getName() + " had to pay " + property.getPrice() + "$ to " + payment_receiver.getName());
        }
        else
            System.out.println("Player " + player.getName() + " does not have enough money to make this payment.");
    }
}
