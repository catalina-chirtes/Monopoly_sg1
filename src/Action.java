public interface Action {
    Board board = new Board();
    InputDevice id = new InputDevice();
    OutputDevice od = new OutputDevice();
    Action apply(Player Player);
}
