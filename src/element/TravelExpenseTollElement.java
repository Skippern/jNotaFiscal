package element;

import java.util.Date;

public class TravelExpenseTollElement {
	private TravelExpenseTollElement nextElement;
	private TravelExpenseTollElement previousElement;
	private double elementPrice;
	private CurrencyElement elementCurrency;
	private Date elementDate;
	private String elementLocation;
	
	public TravelExpenseTollElement(Date date, String location, double price) {
		elementDate = date;
		elementLocation = location;
		elementPrice = price;
	}
	public TravelExpenseTollElement(Date date, String location, double price, CurrencyElement currency) {
		elementDate = date;
		elementLocation = location;
		elementPrice = price;
		elementCurrency = currency;
	}
	
	public Date getDate() {
		return elementDate;
	}
	public String getLocation() {
		return elementLocation;
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
	
	public TravelExpenseTollElement getNext() {
		return nextElement;
	}
	public TravelExpenseTollElement getPrevious() {
		return previousElement;
	}
	public void setNext(TravelExpenseTollElement next) {
		nextElement = next;
	}
	public void setPrevious(TravelExpenseTollElement previous) {
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
