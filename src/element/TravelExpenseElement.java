package element;

import java.util.Date;

public class TravelExpenseElement {
	private TravelExpenseElement nextElement;
	private TravelExpenseElement previousElement;
	private TravelExpenseAirfaireElement myAirfaire;
	private TravelExpenseBoatElement myBoat;
	private TravelExpenseBusElement myBus;
	private TravelExpenseCarRentalElement myCarRental;
	private TravelExpenseCombustivelElement myCombustivel;
	private TravelExpenseHotelElement myHotel;
	private TravelExpenseMealsElement myMeals;
	private TravelExpenseMilageElement myMiles;
	private TravelExpenseParkingElement myParking;
	private TravelExpenseTaxiElement myTaxi;
	private TravelExpenseTollElement myToll;
	private TravelExpenseTrainElement myTrain;
	private CurrencyElement myCurrency;
	
	private String myTravelExpenseOwner;
	private Date myTravelExpenseFinalized;
	
	private String myTravelExpenseJobName;
	private String myTravelExpenseJobRef;
	
	public TravelExpenseElement(String owner, String jobName, String jobRef) {
		myTravelExpenseOwner = owner;
		myTravelExpenseJobName = jobName;
		myTravelExpenseJobRef = jobRef;
	}
	
	public String getJobRef() {
		return myTravelExpenseJobRef;
	}
	public void setJobRef(String jobRef) {
		myTravelExpenseJobRef = jobRef;
	}
	public String getJobName() {
		return myTravelExpenseJobName;
	}
	public void setJobName(String jobName) {
		myTravelExpenseJobName = jobName;
	}
	public String getOwner() {
		return myTravelExpenseOwner;
	}
	public void setOwner(String owner) {
		myTravelExpenseOwner = owner;
	}
	
	public Date getFinalized() {
		return myTravelExpenseFinalized;
	}
	
	public CurrencyElement getCurrency() {
		return myCurrency;
	}
	
	public TravelExpenseAirfaireElement getAirfaire() {
		return myAirfaire;
	}
	
	public TravelExpenseBoatElement getBoat() {
		return myBoat;
	}
	
	public TravelExpenseBusElement getBus() {
		return myBus;
	}
	
	public TravelExpenseCarRentalElement getRental() {
		return myCarRental;
	}
	
	public TravelExpenseCombustivelElement getCombustivel() {
		return myCombustivel;
	}
	
	public TravelExpenseHotelElement getHotel() {
		return myHotel;
	}
	
	public TravelExpenseMealsElement getMeals() {
		return myMeals;
	}
	
	public TravelExpenseMilageElement getMiles() {
		return myMiles;
	}
	
	public TravelExpenseParkingElement getParking() {
		return myParking;
	}
	
	public TravelExpenseTaxiElement getTaxi() {
		return myTaxi;
	}
	
	public TravelExpenseTollElement getToll() {
		return myToll;
	}
	
	public TravelExpenseTrainElement getTrain() {
		return myTrain;
	}
	
	public TravelExpenseElement getNext() {
		return nextElement;
	}
	public TravelExpenseElement getPrevious() {
		return previousElement;
	}
	public void setNext(TravelExpenseElement next) {
		nextElement = next;
	}
	public void setPrevious(TravelExpenseElement previous) {
		previousElement = previous;
	}

	public void killElement() {
		if (nextElement != null) {
			if (previousElement != null) nextElement.setPrevious(previousElement);
			else nextElement.setPrevious(null);
		} else if (previousElement != null) {
			if (nextElement != null) previousElement.setNext(nextElement);
			else previousElement.setNext(null);
		}
	} 
}
