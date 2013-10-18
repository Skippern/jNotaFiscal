package element;

import java.util.Date;

public class TravelExpenseHotelElement {
	private TravelExpenseHotelElement nextElement;
	private TravelExpenseHotelElement previousElement;
	private String elementCity;
	private String elementHotel;
	private Date checkinD;
	private Date checkoutD;
	private double elementPrice;
	private CurrencyElement elementCurrency;
	
	public TravelExpenseHotelElement(String city, String hotel, Date checkin, Date checkout, double price) {
		elementCity = city;
		elementHotel = hotel;
		checkinD = checkin;
		checkoutD = checkout;
		elementPrice = price;
	}
	public TravelExpenseHotelElement(String city, String hotel, Date checkin, Date checkout, double price, CurrencyElement currency) {
		elementCity = city;
		elementHotel = hotel;
		checkinD = checkin;
		checkoutD = checkout;
		elementPrice = price;
		elementCurrency = currency;
	}
	
	public String toString() {
		return elementHotel + " in " + elementCity;
	}
	/**
	 * 
	 * @return INT days in hotel
	 */
	public int getDuration() {
		int temp = (int) ((checkoutD.getTime() - checkinD.getTime()) / 86400000); 
		return temp;
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
	
	public TravelExpenseHotelElement getNext() {
		return nextElement;
	}
	public TravelExpenseHotelElement getPrevious() {
		return previousElement;
	}
	public void setNext(TravelExpenseHotelElement next) {
		nextElement = next;
	}
	public void setPrevious(TravelExpenseHotelElement previous) {
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
