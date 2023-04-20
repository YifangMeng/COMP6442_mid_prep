package Q9;

public class WalkState implements State{
    private static WalkState instance;
    public WalkState(){}

    public static WalkState getInstance() {
        if (instance==null)
            instance=new WalkState();
        return instance;
    }

    @Override
    public void handleInput(Character character, Key event) {

    }
}
