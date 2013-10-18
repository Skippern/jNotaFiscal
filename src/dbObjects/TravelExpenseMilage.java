package dbObjects;

public class TravelExpenseMilage {
	private int temID;
	private String temFrom;
	private String temTo;
	private double temKilometer;
	private TravelExpenses temExpences;
	
	public TravelExpenseMilage(TravelExpenses e, String from, String to, double distance) {
		temID = -1;
		temExpences = e;
		temFrom = from;
		temTo = to;
		temKilometer = distance;
	}
	
	public int getID() {
		return temID;
	}
	public TravelExpenses getExpenses() {
		return temExpences;
	}
	public String getOrigin() {
		return temFrom;
	}
	public String getDestination() {
		return temTo;
	}
	public void setDIstance(double newDistance) {
		temKilometer = newDistance;
	}
	public double getDistance() {
		return temKilometer;
	}
	public String toString() {
		return getOrigin() + " - " + getDestination() + ": " + getDistance() + " km";
	}

}
