package element;

import java.util.Date;

public class TravelExpenseBusElement {
	private TravelExpenseBusElement nextElement;
	private TravelExpenseBusElement previousElement;
	private String elementFrom;
	private String elementTo;
	private Date travelDate;
	private CurrencyElement elementCurrency = null;
	private double elementPrice;
	
	TravelExpenseBusElement(String from, String to, double price) {
		elementFrom = from;
		elementTo = to;
		elementPrice = price;
	}
	TravelExpenseBusElement(String from, String to, Date date, double price) {
		elementFrom = from;
		elementTo = to;
		travelDate = date;
		elementPrice = price;
	}
	TravelExpenseBusElement(String from, String to, double price, CurrencyElement currency) {
		elementFrom = from;
		elementTo = to;
		elementPrice = price;
		elementCurrency = currency;
	}
	TravelExpenseBusElement(String from, String to, Date date, double price, CurrencyElement currency) {
		elementFrom = from;
		elementTo = to;
		travelDate = date;
		elementPrice = price;
		elementCurrency = currency;
	}
	
	public String toString() {
		String tmp = "";
		
		tmp += elementFrom + " - " + elementTo + ": ";
		if (elementCurrency != null) tmp += elementCurrency.getName() + " " + elementPrice;
		else tmp += "BRL " + elementPrice;
		if (elementCurrency != null) tmp += " (BRL " + elementCurrency.getExchange() * elementPrice + ")";
		
		return tmp;
	}
	
	public String getOrigen() {
		return elementFrom;
	}
	public String getDestination() {
		return elementTo;
	}
	public Date getDate() {
		return travelDate;
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
	
	public TravelExpenseBusElement getNext() {
		return nextElement;
	}
	public TravelExpenseBusElement getPrevious() {
		return previousElement;
	}
	public void setNext(TravelExpenseBusElement next) {
		nextElement = next;
	}
	public void setPrevious(TravelExpenseBusElement previous) {
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
