public class WaitingToSelect extends State{
    public WaitingToSelect(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void handle(Event event) {
        if (event==Event.Cancelled || event==Event.Timeout)
            this.getMachine().setState(new Idle(this.machine));
        if (event==Event.ItemSelected)
            this.getMachine().setState(new WaitingToPay(this.machine));
    }
}
