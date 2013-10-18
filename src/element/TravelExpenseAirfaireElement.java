package element;

import java.util.Date;

public class TravelExpenseAirfaireElement {
	private TravelExpenseAirfaireElement nextElement;
	private TravelExpenseAirfaireElement previousElement;
	private String elementAirline;
	private String elementFlight;
	private String elementFrom;
	private String elementTo;
	private Date elementDate;
	private double elementPrice;
	private CurrencyElement elementCurrency;
	
	public TravelExpenseAirfaireElement(String airline, String flight, String from, String to, Date date, double price) {
		elementAirline = airline;
		elementFlight = flight;
		elementFrom = from;
		elementTo = to;
		elementDate = date;
		elementPrice = price;
	}
	public TravelExpenseAirfaireElement(String airline, String flight, String from, String to, Date date, double price, CurrencyElement currency) {
		elementAirline = airline;
		elementFlight = flight;
		elementFrom = from;
		elementTo = to;
		elementDate = date;
		elementPrice = price;
		elementCurrency = currency;
	}
	
	public String getAirline() {
		return elementAirline;
	}
	public String getFlight() {
		return elementFlight;
	}
	public String getOrigen() {
		return elementFrom;
	}
	public String getDestination() {
		return elementTo;
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
	
	public TravelExpenseAirfaireElement getNext() {
		return nextElement;
	}
	public TravelExpenseAirfaireElement getPrevious() {
		return previousElement;
	}
	public void setNext(TravelExpenseAirfaireElement next) {
		nextElement = next;
	}
	public void setPrevious(TravelExpenseAirfaireElement previous) {
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
