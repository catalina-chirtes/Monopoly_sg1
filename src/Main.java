public class Main {
    public static void main(String[] args) {
        InputDevice in = new InputDevice();
        OutputDevice out = new OutputDevice();
        Application app = new Application(in, out);
        app.setPlayers(Integer.parseInt(args[0]));
        app.setRounds(Integer.parseInt(args[1]));
        app.play_game();
    }
}