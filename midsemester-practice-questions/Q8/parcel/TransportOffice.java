package Q8.parcel;

public class TransportOffice {

	private static TransportOffice instance;

	private TransportOffice() {
	}

	public static TransportOffice getInstance() {

		// TODO
		// START YOUR CODE
		if (instance==null)
			instance=new TransportOffice();

		// YOU ARE ALLOWED TO CHANGE THIS RETURNED VALUE
		return instance;

		// END YOUR CODE
	}

	public Transport transportBy(Parcel parcel) {

		// TODO
		// START YOUR CODE
		if (parcel.getWeight()<=20){
			if (parcel.getAllowedDays()>=1 && parcel.getAllowedDays()<3){
				parcel.setStatus(Status.TRANSFERRING);
				return Transport.AIRPLANE;
			}
			else if (parcel.getAllowedDays()>=3 && parcel.getAllowedDays()<7) {
				parcel.setStatus(Status.TRANSFERRING);
				return Transport.TRAIN;
			} else if (parcel.getAllowedDays()>=7) {
				parcel.setStatus(Status.TRANSFERRING);
				return Transport.SHIP;
			}
			else{
				parcel.setStatus(Status.RETURNED);
				return null;

			}
		}
		else {
			if (parcel.getAllowedDays()>=3 && parcel.getAllowedDays()<7){
				parcel.setStatus(Status.TRANSFERRING);
				return Transport.TRAIN;
			} else if (parcel.getAllowedDays()>=7) {
				parcel.setStatus(Status.TRANSFERRING);
				return Transport.SHIP;
			}
			else{
				parcel.setStatus(Status.RETURNED);
				return null;
			}
		}

		// YOU ARE ALLOWED TO CHANGE THIS RETURNED VALUE

		// END YOUR CODE
	}
}
