package Q8.parcel;

public class Recipient {

	public Recipient() {
	}

	public void receive(Parcel parcel) {
		// TODO
		// START YOUR CODE
		if (parcel.getRecipient()==this)
			parcel.setStatus(Status.DELIVERED);
		else
			parcel.setStatus(Status.RETURNED);
		
		
		// END YOUR CODE
	}
}
