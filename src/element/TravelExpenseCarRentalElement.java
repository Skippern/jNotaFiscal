package element;

import java.util.Date;

public class TravelExpenseCarRentalElement {
	private TravelExpenseCarRentalElement nextElement;
	private TravelExpenseCarRentalElement previousElement;
	private String rentalAgency;
	private String pickupLocation;
	private String deliveryLocation;
	private Date pickupDate;
	private Date deliveryDate;
	private double elementPrice;
	private CurrencyElement elementCurrency;
	
	public TravelExpenseCarRentalElement(String agency, String location, double price) {
		rentalAgency = agency;
		pickupLocation = location;
		deliveryLocation = location;
	}
	public TravelExpenseCarRentalElement(String agency, String location, Date pickup, Date delivery, double price) {
		rentalAgency = agency;
		pickupLocation = location;
		deliveryLocation = location;
		pickupDate = pickup;
		deliveryDate = delivery;
		elementPrice = price;
	}
	
	public String getAgency() {
		return rentalAgency;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public String getDeliveryLocation() {
		return deliveryLocation;
	}
	public Date getPickupDate() {
		return pickupDate;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	
	public double getPrice() {
		if (elementCurrency != null) return elementCurrency.getExchange() * elementPrice;
		return elementPrice;
	}
	public String getPriceInBRL() {
		return "R$ " + getPrice();
	}
	public String getPriceInLocal() {
		String c = "BRL";
		if (elementCurrency != null) c = elementCurrency.getName();
		
		return c + " " + elementPrice;
	}
		
	public TravelExpenseCarRentalElement getNext() {
		return nextElement;
	}
	public TravelExpenseCarRentalElement getPrevious() {
		return previousElement;
	}
	public void setNext(TravelExpenseCarRentalElement next) {
		nextElement = next;
	}
	public void setPrevious(TravelExpenseCarRentalElement previous) {
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
