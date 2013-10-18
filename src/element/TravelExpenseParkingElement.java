package element;

import java.util.Date;

public class TravelExpenseParkingElement {
	private TravelExpenseParkingElement nextElement;
	private TravelExpenseParkingElement previousElement;
	private double elementPrice;
	private CurrencyElement elementCurrency;
	private Date elementDate;
	private String elementLocation;

	public TravelExpenseParkingElement(Date date, String location, double price) {
		elementDate = date;
		elementPrice = price;
		elementLocation = location;
	}
	public TravelExpenseParkingElement(Date date, String location, double price, CurrencyElement currency) {
		elementDate = date;
		elementLocation = location;
		elementPrice = price;
		elementCurrency = currency;
	}
	
	public String getLocation() {
		return elementLocation;
	}
	public Date getDate() {
		return elementDate;
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
	
	public TravelExpenseParkingElement getNext() {
		return nextElement;
	}
	public TravelExpenseParkingElement getPrevious() {
		return previousElement;
	}
	public void setNext(TravelExpenseParkingElement next) {
		nextElement = next;
	}
	public void setPrevious(TravelExpenseParkingElement previous) {
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
