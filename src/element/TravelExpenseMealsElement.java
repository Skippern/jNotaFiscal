package element;

import java.util.Date;

public class TravelExpenseMealsElement {
	private TravelExpenseMealsElement nextElement;
	private TravelExpenseMealsElement previousElement;
	private CurrencyElement elementCurrency;
	private Date mealsDate;
	private double elementPrice;
	
	public TravelExpenseMealsElement(Date date, double price) {
		mealsDate = date;
		elementPrice = price;
	}
	public TravelExpenseMealsElement(Date date, double price, CurrencyElement currency) {
		mealsDate = date;
		elementPrice = price;
		elementCurrency = currency;
	}
	
	public Date getDate() {
		return mealsDate;
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
	
	public TravelExpenseMealsElement getNext() {
		return nextElement;
	}
	public TravelExpenseMealsElement getPrevious() {
		return previousElement;
	}
	public void setNext(TravelExpenseMealsElement next) {
		nextElement = next;
	}
	public void setPrevious(TravelExpenseMealsElement previous) {
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
