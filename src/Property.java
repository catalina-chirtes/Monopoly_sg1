public class Property extends Square{
    private boolean upgradable;
    private boolean owned = false;
    private String owner_name = "";
    private int price;

    Property (String name, boolean upgradable, int price) {
        super(name, null);
        this.upgradable = upgradable;
        this.price = price;
    }

    public boolean isUpgradable() {
        return upgradable;
    }
    public String getOwner_name() {
        return owner_name;
    }
    public void setOwner_name(String name) {
        owner_name = name;
        owned = true;
    }
    public boolean isOwned() {
        return owned;
    }
    public int getPrice() {
        return price;
    }

//    public void buy_property(Player player, Player Bank) {
//        if (player.getMoney()>=this.price)
//        {
//            Bank.setMoney(Bank.getMoney() + this.price);
//            player.setMoney(player.getMoney() - this.price);
//            setOwner_name(player.getName());
//        }
//        else
//            System.out.println("Player " + player.getName() + " does not have enough money to buy this property.");
//    }
//    public void pay_tax (Player player, Player[] players_arr) {
//        for (Player i: players_arr)
//            if (i.getName().equals(owner_name))
//            {
//                i.setMoney(i.getMoney() + this.price);
//                player.setMoney(player.getMoney() - this.price);
//                break;
//            }
//    }
}
