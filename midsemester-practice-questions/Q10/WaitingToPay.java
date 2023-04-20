public class WaitingToPay extends State{
    public WaitingToPay(VendingMachine machine) {
        super(machine);
    }

    @Override
    public void handle(Event event) {
        if (event==Event.Cancelled || event==Event.Timeout)
            this.getMachine().setState(new Idle(this.machine));
        if (event==Event.ItemPaid)
            this.getMachine().setState(new WaitingToDispense(this.machine));
    }
}
