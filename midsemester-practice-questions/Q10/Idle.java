public class Idle extends State{
    public Idle(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void handle(Event event) {
        if (event==Event.AnyButton)
            this.getMachine().setState(new WaitingToSelect(this.machine));
    }
}
