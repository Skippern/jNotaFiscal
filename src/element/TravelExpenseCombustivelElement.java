package element;

import java.util.Date;
import enums.*;

public class TravelExpenseCombustivelElement {
	private TravelExpenseCombustivelElement nextElement;
	private TravelExpenseCombustivelElement previousElement;
	private int combustivelClass;
	private double combustivelVolume;
	private double elementPrice;
	private Date elementDate;
	private CurrencyElement elementCurrency;
	
	public TravelExpenseCombustivelElement(Date date, int type, double volume, double price) {
		elementDate = date;
		combustivelClass = type;
		combustivelVolume = volume;
		elementPrice = price;
	}
	public TravelExpenseCombustivelElement(Date date, int type, double volume, double price, CurrencyElement currency) {
		elementDate = date;
		combustivelClass = type;
		combustivelVolume = volume;
		elementPrice = price;
		elementCurrency = currency;
	}
	
	public double getVolume() {
		return combustivelVolume;
	}
	public double getVolumPrice() {
		return elementPrice / combustivelVolume;
	}
	public int getCombustivelClass() {
		return combustivelClass;
	}
	
	public Date getDate() {
		return elementDate;
	}
	
	public String getCombustivelName() {
		Combustivel[] allFuel = Combustivel.values();
		for (int i = 0; i < allFuel.length; i++) {
			if (allFuel[i].getType() == combustivelClass) return allFuel[i].getName();
		}
		return null;
	}
	public String getCombustivelUnit() {
		Combustivel[] allFuel = Combustivel.values();
		for (int i = 0; i < allFuel.length; i++) {
			if (allFuel[i].getType() == combustivelClass) return allFuel[i].getUnit();
		}
		return null;
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
	
	public TravelExpenseCombustivelElement getNext() {
		return nextElement;
	}
	public TravelExpenseCombustivelElement getPrevious() {
		return previousElement;
	}
	public void setNext(TravelExpenseCombustivelElement next) {
		nextElement = next;
	}
	public void setPrevious(TravelExpenseCombustivelElement previous) {
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
