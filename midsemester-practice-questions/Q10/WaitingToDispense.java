public class WaitingToDispense extends State{
    public WaitingToDispense(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void handle(Event event) {
        if (event==Event.ItemDispensed)
            this.getMachine().setState(new ReadyToCollect(this.machine));
    }
}
