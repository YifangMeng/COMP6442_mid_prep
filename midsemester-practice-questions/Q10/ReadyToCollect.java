public class ReadyToCollect extends State{
    public ReadyToCollect(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void handle(Event event) {
        if (event==Event.Timeout)
            this.getMachine().setState(new Idle(this.machine));

    }
}
