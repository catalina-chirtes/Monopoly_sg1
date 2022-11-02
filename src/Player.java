public class Player {
    private String name;
    private int money = 0;
    private int dice_roll = 0;
    private int position = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDice_roll() {
        return dice_roll;
    }

    public void setDice_roll(int dice_roll) {
        this.dice_roll = dice_roll;
    }
//    public void move(int dice_roll, Player Bank) {
//        this.dice_roll = dice_roll;
//        this.position = this.position + dice_roll;
//        if(this.position > 39){
//            this.position = this.position - 40;
//            this.money = this.money + 200;
//            Bank.setMoney(Bank.getMoney() - 200);
//        }
//    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
