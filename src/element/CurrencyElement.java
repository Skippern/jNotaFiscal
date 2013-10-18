package element;

//import java.util.Currency;

public class CurrencyElement {
	private CurrencyElement nextElement;
	private CurrencyElement previousElement;
	private String elementName;
	private double elementExchange;
	
	public CurrencyElement(String currency, double exchange) {
		elementName = currency;
		elementExchange = exchange;
	}
	
	public String getName() {
		return elementName;
	}
	public double getExchange() {
		return elementExchange;
	}
	public double getInverseExchange() {
		return 1 / elementExchange;
	}
	public void setExchange(double exchange) {
		elementExchange = exchange;
	}
	
	public String toString() {
		return "1 BRL = " + getExchange() + " " + getName();
	}
	
	public CurrencyElement getNext() {
		return nextElement;
	}
	public CurrencyElement getPrevious() {
		return previousElement;
	}
	public void setNext(CurrencyElement next) {
		nextElement = next;
	}
	public void setPrevious(CurrencyElement previous) {
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
