

public class Property extends Square {
    int price;
    int tax;
    Player owner;

    public Property( String name, int price, int tax, Player owner) {
        super(name);
        this.price = price;
        this.tax = tax;
        this.owner = null;
    }

    void buyProperty(Player p){
        if(owner==null) {
            p.money -= price;
            owner = p;
            p.property_nb++;
        }
    }

    void payTax(Player p){
        if(owner!=null)
            p.money -= tax;
    }



}
