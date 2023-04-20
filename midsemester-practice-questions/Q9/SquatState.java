package Q9;

public class SquatState implements State{
    private static SquatState instance;
    public SquatState(){}

    public static SquatState getInstance() {
        if (instance==null)
            instance=new SquatState();
        return instance;
    }

    @Override
    public void handleInput(Character character, Key event) {

    }
}
