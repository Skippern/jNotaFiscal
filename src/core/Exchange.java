package core;

import java.util.ArrayList;

public class Exchange {
	private ArrayList<ExchangeObject> exchangeRates;
	
	public Exchange() {
		
	}
	
	public void addExchange(String Currency, double Value) {
		// add value when entry doesn't exist
		ExchangeObject tmp = new ExchangeObject(Currency, Value);
		exchangeRates.add(tmp);
	}
	public void setExchange(String Currency, double Value) {
		// change exchange rate in existing entry
	}
	public void removeExchange(String Currency) {
		// remove exchange rate in existing entry
	}
	public double queryExchange(String Currency) {
		// find exchange rate of currency
		return 1.0;
	}
	
	final class ExchangeObject {
		String eA;
		double eI;
		
		private ExchangeObject(String a,double i) {
			eA = a;
			eI = i;
		}
	}
}

