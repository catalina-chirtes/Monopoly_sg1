public class Board {
    Square[] squares;
    int Bank;

    public Board(){
        InputDevice id = new InputDevice();
        this.squares = new Square[40];
        this.squares = id.getSquares();
        this.Bank = 20580;
    }
}
