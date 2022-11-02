public class Square {
    private String name;
    private Action action;
    Square(String name, Action action) {
        this.name=name;
        this.action=action;
    }
    String getName() {
        return name;
    }
    Action getAction() {
        return action;
    }
}
