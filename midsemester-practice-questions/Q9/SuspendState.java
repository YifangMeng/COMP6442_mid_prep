package Q9;

public class SuspendState implements State{
    private static SuspendState instance;
    public SuspendState(){}

    public static SuspendState getInstance() {
        if (instance==null)
            instance=new SuspendState();
        return instance;}

    @Override
    public void handleInput(Character character, Key event) {

    }
}
