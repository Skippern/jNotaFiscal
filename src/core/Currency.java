package core;

public class Currency {
	private double CurrencyValue;
	private String CurrencyCoin = "BRL";
	
	public Currency(double Value) {
		CurrencyValue = Value;
	}
	public Currency(double Value, String cUrrency) {
		CurrencyValue = Value;
		CurrencyCoin = cUrrency;
	}
	
	public double getValue() {
		return CurrencyValue;
	}
	public String getCurrency() {
		return CurrencyCoin;
	}
	public Object[] getRates() {
		Object[] tmp = { CurrencyCoin, CurrencyValue };
		return tmp;
	}
	
	public String toString() {
		return CurrencyCoin + CurrencyValue;
	}

}
