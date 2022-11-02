public class Board {
    Square[] squares;

    public Board(){
        InputDevice id = new InputDevice();
        this.squares = new Square[40];
        this.squares = id.getSquares();
    }
}
