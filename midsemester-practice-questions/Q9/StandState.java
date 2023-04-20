package Q9;

public class StandState implements State{
    private static StandState instance;
    public StandState(){}

    public static StandState getInstance() {
        if (instance==null)
            instance=new StandState();
        return instance;
    }

    @Override
    public void handleInput(Character character, Key event) {

    }
}
