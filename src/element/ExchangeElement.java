package element;

import java.util.ArrayList;
import java.util.Currency;

public class ExchangeElement {
	/*
	 * What we want to do here is to make a two-dimensional matrix
	 * where you easily can look up the exchange rate between two currencies
	 * On creation, it should put up a table with all currencies, where
	 * exchange between same currency is 1, and all others are NULL
	 * a get exchange call should use from currency and to currency as
	 * arguments, and return the exchange factor to be multiplied to the
	 * from value to get the to value, if a third argument is given, we 
	 * have the input value and can return directly the output value
	 */
	public ExchangeElement() {
		/* Creates the matrix */
	}
	/**
	 * 
	 * @param inCurrency Input Currency in ISO 4217 name
	 * @param outCurrency Output Currency in ISO 4217 name
	 * @param exchange Exchange rate to be put into the matrix
	 */
	public void setExchange(String inCurrency, String outCurrency, double exchange) {
		
	}
	/**
	 * 
	 * @param inCurrency
	 * @param outCurrency
	 * @return
	 */
	public double getExchange(String inCurrency, String outCurrency) {
		return 0.0;
	}
	/**
	 * 
	 * @param inCurrency
	 * @param outCurrency
	 * @param value
	 * @return
	 */
	public double getExchange(String inCurrency, String outCurrency, double value) {
		return value * getExchange(inCurrency, outCurrency);
	}
}
